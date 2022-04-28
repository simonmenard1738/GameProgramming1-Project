// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Projectile here.
 * @author (your name) @version (a version number or a date)
 */
public class Projectile extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        attack();
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
}
