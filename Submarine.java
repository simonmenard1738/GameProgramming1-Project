import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Submarine extends Actor
{

    /**
     * Act - do whatever the Submarine wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
     
     
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            
        }
        hitSub();
        hitWp();
        
    }
    public void hitSub(){
        Actor shark = getOneIntersectingObject(Shark.class);
        
        
        if(shark!=null){
            World world = getWorld();
            world.removeObject(shark);
            MyWorld.health = MyWorld.health-1;
            Level2.health = MyWorld.health;
            Level3.health = Level2.health;
            Greenfoot.playSound("damage.wav");
        }
    }
    public void hitWp(){
        Actor wp = getOneIntersectingObject(Whirlpool.class);
        
        if(wp!=null){
            World world = new GameOverWorld();
            Greenfoot.setWorld(world);
            Greenfoot.playSound("wpdamage.wav");
        }
    }
    
    }
    

