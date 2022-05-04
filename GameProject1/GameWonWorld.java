import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
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
        InfoButton infoButton = new InfoButton();
        addObject(infoButton,328,108);
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,199,265);
        Exit exit = new Exit();
        addObject(exit,197,317);
        Heart heart = new Heart();
        addObject(heart,138,379);
        Heart heart2 = new Heart();
        addObject(heart2,189,378);
        Heart heart3 = new Heart();
        addObject(heart3,245,378);
    }
}
