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
            move(-3);
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            
        }
        hitSub();
    }
    public void hitSub(){
        Actor shark = getOneIntersectingObject(Shark.class);
        
        if(getWorld()==new MyWorld()){
        if(shark!=null){
            MyWorld world =(MyWorld) new MyWorld();
            world.removeObject(shark);
            world.health= world.health-1;
        }
    }
        else if(getWorld()==new Level2()){
            if(shark!=null){
            Level2 level2 = (Level2) new Level2();
            level2.removeObject(shark);
            level2.health= level2.health-1;
        }
    }
    }
            
    }
    

