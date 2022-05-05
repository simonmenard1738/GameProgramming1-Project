import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World
{

    double timeSplashScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(400, 445, 1);
    }
    public void act() {
        pressSpace();
        timerCount();

    }
    public void pressSpace() {
        if (Greenfoot.isKeyDown("space"))
        {
            StartScreen startScreen = new StartScreen();
            Greenfoot.setWorld(startScreen); 
            startScreen.started();

        }
    }

    public void timerCount() {
        int timerValue = (int) (System.currentTimeMillis() - timeSplashScreenCreation)/1000; 

        if (System.currentTimeMillis() >= (timeSplashScreenCreation + (3 * 1000))) 
        { 
            World startScreen = new StartScreen();
            Greenfoot.setWorld(startScreen); 
            startScreen.started();
        }
    }
}
