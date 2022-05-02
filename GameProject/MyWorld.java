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
        Display display = new Display();
        addObject(display,300,50);
        int timerValue = (int) (System.currentTimeMillis() - startTime)/1000;
        display.setImage(new GreenfootImage("Timer :" + timerValue , 20, Color.WHITE, Color.BLACK));
        
        Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 20,Color.WHITE, Color.BLACK));
        
        Shark shark = new Shark();
        if(Greenfoot.getRandomNumber(100)<2){
            int sharkX = Greenfoot.getRandomNumber(getWidth());
            int sharkY = Greenfoot.getRandomNumber(50);
            addObject(shark,sharkX, sharkY);
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
            
    public void decreaseHealth(){
        health = health-1;
    }
    public void gameOver(){
        //add transition;
    }
    
}
    

