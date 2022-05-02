import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(400, 600, 1);
        prepare();
    }

    public void act()
    {
        /*if (Greenfoot.isKeyDown("space"))
        {
        transitionToWorld(new MyWorld()); 

        }*/
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,200,451);
    }
}
