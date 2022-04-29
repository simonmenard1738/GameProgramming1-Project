import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    // fake code
    double startTime = System.currentTimeMillis();
    int counter = 0;
    private int health = 3;
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
        Display display = new Display();
        addObject(display,300,50);
        int timerValue = (int) (System.currentTimeMillis() - startTime)/1000;
        display.setImage(new GreenfootImage("Timer Value :" + timerValue , 20, Color.BLACK, Color.BLACK, Color.YELLOW));
        
        Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 20,Color.BLACK, Color.BLACK, Color.YELLOW));
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { //make 2 sharks every 2 seconds 
        
        int create = Greenfoot.getRandomNumber(4);
        
        for(int i = 0; i<create; i++){
            Shark shark = new Shark();
            addObject(shark, Greenfoot.getRandomNumber(400), 0);             
        }        
    }
        
        

        
    
    public void decreaseHealth(){
        health = health-1;
    }
    public void gameOver(){
        //add transition;
    }
}
