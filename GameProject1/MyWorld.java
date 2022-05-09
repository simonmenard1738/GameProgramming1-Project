import lang.stride.*;
import greenfoot.*;
import java.util.*;


/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    int counter=0;
    int counterWp = 0;
    static int health = 3;
    static GreenfootSound music = new GreenfootSound("bgmusic1.wav");
    public boolean playingLevel = true;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 600, 1);
        prepare();
        act();
    }
    
     public void act(){
        showHealth();
        Shark shark = new Shark();
        
        if(Greenfoot.getRandomNumber(100)<2)
        {
            int sharkX = Greenfoot.getRandomNumber(getWidth());
            int sharkY = Greenfoot.getRandomNumber(10);
            addObject(shark,sharkX, sharkY);
            counter=counter+1;
        }
        
        Whirlpool wp = new Whirlpool();
        
        if(counterWp<6){
        if(Greenfoot.getRandomNumber(200)<2){
            int wpX = Greenfoot.getRandomNumber(getWidth());
            int wpY = Greenfoot.getRandomNumber(5);
            addObject(wp, wpX, wpY);
            counterWp++;
            }
        }
            Heart heart = new Heart();
            addObject(heart, 40,50);
            Heart heart2 = new Heart();
            addObject(heart2, 85,50);
            Heart heart3 = new Heart();        
            addObject(heart3, 130,50);
        
        if(health == 2){
            
            DeadHeart dh = new DeadHeart();
            addObject(dh, 130, 50);
        }
        if(health == 1){
            DeadHeart dh = new DeadHeart();
            addObject(dh, 130, 50);
            DeadHeart dh2 = new DeadHeart();
            addObject(dh2, 85, 50);
        }
        transitionGameOverWorld();
        transitionLevel2();
        //sound code
            GameWonWorld.stoppedWin();
            StartScreen.stopped5();
            GameOverWorld.stopped4();
            Level2.stopped2();
            Level3.stopped3();
            music.playLoop();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {      
        Submarine submarine = new Submarine();
        addObject(submarine,200,560);
        Exit exit = new Exit();
        addObject(exit, 330, 50);
    }

    public void showHealth(){
        Display display1 = new Display();
        addObject(display1, 215, 50);
        display1.setImage(new GreenfootImage("Level 1",30, Color.WHITE, Color.BLACK));     
        
        /*Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 25,Color.WHITE, Color.BLACK));*/
    }
    
    public void transitionGameOverWorld(){
        if(health == 0){
            World world = new GameOverWorld();
            Greenfoot.setWorld(world);
            playingLevel = false;
        }
    }
    
    public boolean sharkCounter(){
        if(counter == 10){
            return true;
        }
        return false;
    }
    
    public void transitionLevel2(){
        if (sharkCounter()==true){
            World world = new Level2();
            Greenfoot.setWorld(world);
            playingLevel = false;
        }
    }
    
    public void loseHealth(){
        health = health-1;
    }
    
    public static void started1(){
        music.playLoop();
    }
    
    public static void stopped1(){
        music.stop();
    }
}
    
