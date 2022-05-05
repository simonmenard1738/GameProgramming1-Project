import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RestartButton extends Actor
{
    GreenfootSound music = new GreenfootSound("gameOverMusic.wav");
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RestartButton(){
        music.playLoop();
    }
    public void act()
    {
    if (Greenfoot.mouseMoved(this))
    {
        setImage("RestartHightlighted.png");
    }

    if (Greenfoot.mouseMoved(getWorld()))
    {
        setImage("restart.png");
    }
     if(Greenfoot.mouseClicked(this)){
        MyWorld world = new MyWorld();
        world.health=3;
        Greenfoot.setWorld(world);
        music.stop();
    }
    }
}
