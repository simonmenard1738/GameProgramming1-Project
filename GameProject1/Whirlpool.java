import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Whirlpool extends Actor
{

    /**
     * Act - do whatever the Whirlpool wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    public void move(){
        setRotation(90);
        
        move(5);
        if(isAtEdge()==true){
            getWorld().removeObject(this);
                       
        }
    }
}
