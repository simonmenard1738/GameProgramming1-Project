import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Exit extends Actor
{

    /**
     * Act - do whatever the Exit wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
    {
        setImage("exit_highlighted.PNG");
    }

    if (Greenfoot.mouseMoved(getWorld()))
    {
        setImage("exit.jpg");
    }

    if (Greenfoot.mouseClicked(this))
    {
       
       World world = new StartScreen();
       Greenfoot.setWorld(world);
    }
    }
}
