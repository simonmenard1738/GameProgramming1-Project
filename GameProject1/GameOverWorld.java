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
        addObject(exit,195,415);
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,195,475);
    }

 
    
    public static void stopped4(){
        music4.stop();
    }
}
