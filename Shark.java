import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Projectile here.
 * @author (your name) @version (a version number or a date)
 */
public class Shark extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    int x = 2;
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
        
        /* Add your action code here.*/
    }

    /**
     * 
     */
    public void move()
    {
        setRotation(90);
        
        move(x);
        if(isAtEdge()==true){
            getWorld().removeObject(this);
                       
        }
        
        
        
    }
    

    
       }
    
    

