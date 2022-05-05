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
        DeadHeart deadHeart = new DeadHeart();
        addObject(deadHeart,145,260);
        DeadHeart deadHeart2 = new DeadHeart();
        addObject(deadHeart2,189,258);
        DeadHeart deadHeart3 = new DeadHeart();
        addObject(deadHeart3,235,258);
        deadHeart2.setLocation(181,257);
        deadHeart3.setLocation(234,257);
        InfoButton infoButton = new InfoButton();
        addObject(infoButton,190,320);
        deadHeart2.setLocation(178,255);
        deadHeart2.setLocation(186,258);
        deadHeart3.setLocation(236,257);
        deadHeart2.setLocation(190,255);
        deadHeart3.setLocation(234,268);
        deadHeart.setLocation(142,273);
        deadHeart3.setLocation(239,274);
        deadHeart3.setLocation(239,279);
        deadHeart3.setLocation(243,273);
        Exit exit = new Exit();
        addObject(exit,194,414);
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,193,473);
    }
}
