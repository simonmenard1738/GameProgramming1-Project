import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    static GreenfootSound music4 = new GreenfootSound("gameovermusic.mp3");
    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(400, 600, 1);
        prepare();
        act();
    }

    public void act()
    {
        /*if (Greenfoot.isKeyDown("space"))
        {
        transitionToWorld(new MyWorld()); 
        
        }*/
        MyWorld.stopped1();
        Level2.stopped2();
        Level3.stopped3();
        music4.playLoop(); 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DeadHeart deadHeart = new DeadHeart();
        addObject(deadHeart,145,275);
        DeadHeart deadHeart2 = new DeadHeart();
        addObject(deadHeart2,195,255);
        DeadHeart deadHeart3 = new DeadHeart();
        addObject(deadHeart3,245,275);
        InfoButton infoButton = new InfoButton();
        addObject(infoButton,195,320);
        Exit exit = new Exit();
        addObject(exit,195,415);
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,195,475);
    }
    
    public static void stopped4(){
        music4.stop();
    }
}
