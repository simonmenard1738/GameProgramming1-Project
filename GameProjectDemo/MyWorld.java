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
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 600, 1);
        int count = 40;
        for (int i = 0; i < count; i++) {
            double timer = System.currentTimeMillis();
            if (timer % 1000 == 0) {
                prepare();
            }
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int value = Greenfoot.getRandomNumber(4);
        int[] locations = {50, 150, 250, 350};
        Projectile projectile =  new  Projectile();
        addObject(projectile, locations[value], 0);
        
    }
}
