import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartButton extends Actor
{

    /**
     * Act - do whatever the Button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if (Greenfoot.mouseMoved(this))
    {
        setImage("StartHightlighted.png");
    }

    if (Greenfoot.mouseMoved(getWorld()))
    {
        setImage("start.png");
    }

    if (Greenfoot.mouseClicked(this))
    {       
       MyWorld world = new MyWorld();
       Greenfoot.setWorld(world);
    }
}
}
