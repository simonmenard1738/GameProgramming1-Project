import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level3 extends World
{
    static int health = Level2.health;
    int counter = 0;
    /**
     * Constructor for objects of class Level3.
     */
    public Level3()
    {
        super(400, 600, 1);
        prepare();
        act();
    }
    private void prepare(){
        Submarine submarine = new Submarine();
        addObject(submarine,200,570);
        
       
        
     }
    public void act(){
        showHealthLevel();
        
        Shark shark = new Shark();
        shark.x = 10;
        if(Greenfoot.getRandomNumber(100)<2){
            int sharkX = Greenfoot.getRandomNumber(getWidth());
            int sharkY = Greenfoot.getRandomNumber(50);
            addObject(shark,sharkX, sharkY);
            shark.move(25);
            counter = counter+1;
            
        }
        transitionGameOverWorld();
        transitionGameWon();
        
    }
    public void showHealthLevel(){
        Display display1 = new Display();
        addObject(display1, 300, 50);
        display1.setImage(new GreenfootImage("Level 3",20, Color.WHITE, Color.BLACK));       
        
        Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 20,Color.WHITE, Color.BLACK));
    }
    public void transitionGameOverWorld(){
        if(health ==0){
            World world = new GameOverWorld();
            Greenfoot.setWorld(world);
     }
    }
    public boolean sharkCounter(){
        
        if(counter == 45){
            
            return true;
        }
        return false;
    }
    public void transitionGameWon(){
        if(sharkCounter()==true){
            World world = new GameWonWorld();
            Greenfoot.setWorld(world);
        }
    }
    
    
}
