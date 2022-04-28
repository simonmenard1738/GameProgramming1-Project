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
    
    static int health = 3;
    double startTime = System.currentTimeMillis();
    int count = 40;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 600, 1);
        prepare();
        livesLeft();
        
    }
    
    public void act(){
        Display display = new Display();
        int timerValue = (int) (System.currentTimeMillis() - startTime)/1000;
        display.setImage(new GreenfootImage("Timer Value :" + timerValue , 35, Color.BLACK, Color.BLACK, Color.YELLOW));
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int value = Greenfoot.getRandomNumber(4);
        int[] locations = {50, 150, 250, 350};
        
        for (int i = 0; i < 40; i++) {
            Projectile p =  new  Projectile();
            addObject(p, locations[value], 0);
            if ((System.currentTimeMillis() - startTime)/1000 > 3) {
                removeObject(p);
                prepare();
            }
        }
        
    }
    public void livesLeft(){
        if(Projectile.score==50){
            health = health-1;
        }
        else if(Projectile.score==25){
            health = health-1;
        }
        else if(Projectile.score==0){
            health = health-1;
        }
        
        showText("Lives: " + health, 50, 50);
        
        
    }
    
}
