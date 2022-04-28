
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{
    double timeMyWorldCreation = System.currentTimeMillis();
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    // fake code
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 600, 1);
        prepare();        
        int counter = 0;
        
        
        
    }
    
    public void act(){
        
        Display display = new Display();
        display.setImage(new GreenfootImage("Timer Value :" + timer , 35, Color.WHITE, Color.BLACK, Color.YELLOW));
    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int timer = (int) (System.currentTimeMillis() - timeMyWorldCreation) / 1000;
        int count = 40;
        for (int i = 0; i < count; i++) {
                int counter = 0;
                int value = Greenfoot.getRandomNumber(4);
                int[] locations = {50, 150, 250, 350};
                Projectile projectile =  new  Projectile();
                addObject(projectile, locations[value], 0);    
                counter++;
        } 
        
        
    }
}
