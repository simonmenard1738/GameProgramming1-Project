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
    // fake code
    double startTime = System.currentTimeMillis();
    int counter=0;
    int counterWp = 0;
    static int health = 3;
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
        //showTime();
        
        showHealth();
        Exit exit = new Exit();
        addObject(exit, 300, 50);
        
        Shark shark = new Shark();
        
        if(Greenfoot.getRandomNumber(100)<2){
            int sharkX = Greenfoot.getRandomNumber(getWidth());
            int sharkY = Greenfoot.getRandomNumber(50);
            addObject(shark,sharkX, sharkY);
            counter=counter+1;
        }
        
        Whirlpool wp = new Whirlpool();
        
        if(counterWp<6){
        if(Greenfoot.getRandomNumber(200)<2){
            int wpX = Greenfoot.getRandomNumber(getWidth());
            int wpY = Greenfoot.getRandomNumber(50);
            addObject(wp, wpX, wpY);
            counterWp++;
            
        }
    }
    
        transitionGameOverWorld();
        transitionLevel2();
            Heart heart = new Heart();
            Heart heart2 = new Heart();
            Heart heart3 = new Heart();        
        
            
            addObject(heart, 70,80);
            
            addObject(heart2, 95,80);
            
            addObject(heart3, 120,80);
        
        if(health == 2){
            
            DeadHeart dh = new DeadHeart();
            addObject(dh, 120, 80);
        }
        if(health == 1){
            DeadHeart dh = new DeadHeart();
            addObject(dh, 120, 80);
            DeadHeart dh2 = new DeadHeart();
            addObject(dh2, 95, 80);
            
            
        }
        
        
        
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { //make 2 sharks every 2 seconds , timer in act()
               
        Submarine submarine = new Submarine();
        addObject(submarine,200,570);
        
   
    }
    public void showTime(){ //not needed
        Display display = new Display();
        addObject(display,300,50);
        int timerValue = (int) (System.currentTimeMillis() - startTime)/1000;
        display.setImage(new GreenfootImage("Timer :" + timerValue , 20, Color.WHITE, Color.BLACK));
        
    }
    public void showHealth(){
        Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 20,Color.WHITE, Color.BLACK));
    }
    
   
    public void transitionGameOverWorld(){
        if(health == 0){
            World world = new GameOverWorld();
            Greenfoot.setWorld(world);
        }
    }
    public boolean sharkCounter(){
        
        if(counter == 20){
            return true;
        }
        return false;
    }
    public void transitionLevel2(){
        if (sharkCounter()==true){
            World world = new Level2();
            Greenfoot.setWorld(world);
        }
    }
    public void loseHealth(){
        health = health-1;
    }
}
    
