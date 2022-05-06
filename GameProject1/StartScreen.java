import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{
long startTime = System.currentTimeMillis();
static GreenfootSound music5 = new GreenfootSound("title.mp3");
    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {
        super(400, 600, 1);
        
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        if (System.currentTimeMillis() >= (startTime + (2 * 1000))){
            Greenfoot.setWorld(new MyWorld());
        }
        StartButton startButton = new StartButton();
        addObject(startButton,199,479);
        InfoButton infoButton = new InfoButton();
        addObject(infoButton,349,49);
    }
    public void act(){
        GameOverWorld.stopped4();
        GameWonWorld.stoppedWin();
        music5.playLoop();
    }
    public static void stopped5(){
        music5.stop();
    }
}
