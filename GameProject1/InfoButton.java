import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class InfoButton extends Actor
{

    /**
     * Act - do whatever the InfoButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
    {
        setImage("InfoHighlighted.png");
    }

     if (Greenfoot.mouseMoved(getWorld()))
    {
        setImage("info.png");
    }
    
    if (Greenfoot.mouseClicked(this))
    {

        Display display = new Display();
        getWorld().addObject(display , 200, 120);
        display.setImage(new GreenfootImage("How to play: \n Move left and right with the keyboard arrows. \n Sharks: Die within 3 hits \n Whirlpool: Die immediately", 20, Color.WHITE, Color.BLACK));

    }
    }
}
