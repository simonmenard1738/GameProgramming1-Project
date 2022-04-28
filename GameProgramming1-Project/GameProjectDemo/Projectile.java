import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Projectile here.
 * @author (your name) @version (a version number or a date)
 */
public class Projectile extends Actor
{
    static int score = 75;
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        attack();
        loseScore();
        /* Add your action code here.*/
    }

    /**
     * 
     */
    public void attack()
    {
        setRotation(90);
        move(4);
    }
    public void loseScore()
    {
        MyWorld world = (MyWorld) getWorld();
        Actor submarine = getOneIntersectingObject(Submarine.class);
        if(submarine != null){
            score = score - 25;
        }
        
    }
}
