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
    }
       
        
    
}
