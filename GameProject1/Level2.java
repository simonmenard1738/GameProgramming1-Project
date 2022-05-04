import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level2 extends World
{
    
    static int health = MyWorld.health;
    int counter = 0;
    int counterWp = 0;
    /**
     * Constructor for objects of class Level2.
     */
    public Level2()
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
        Exit exit = new Exit();
        addObject(exit, 300, 50);
        Shark shark = new Shark();
        shark.x = 6;
        if(Greenfoot.getRandomNumber(100)<2){
            int sharkX = Greenfoot.getRandomNumber(getWidth());
            int sharkY = Greenfoot.getRandomNumber(50);
            addObject(shark,sharkX, sharkY);
            shark.move(20);
            counter = counter+1;
            
        }
            Whirlpool wp = new Whirlpool();
        
        if(counterWp<6){
        if(Greenfoot.getRandomNumber(200)<2){
            int wpX = Greenfoot.getRandomNumber(getWidth());
            int wpY = Greenfoot.getRandomNumber(50);
            addObject(wp, wpX, wpY);
            counterWp++;
            
        }
    }
        //transitionGameOverWorld();
        transitionLevel3();
        Heart heart = new Heart();
            Heart heart2 = new Heart();
            Heart heart3 = new Heart();        
        
            
            addObject(heart, 70,80);
            
            addObject(heart2, 95,80);
            
            addObject(heart3, 120,80);
        
        if(health == 2){
            
            DeadHeart dh = new DeadHeart();
            addObject(dh, 120, 80);
        }
        if(health == 1){
            DeadHeart dh = new DeadHeart();
            addObject(dh, 120, 80);
            DeadHeart dh2 = new DeadHeart();
            addObject(dh2, 95, 80);
            
            
        }
    }
    public void showHealthLevel(){
        Display display1 = new Display();
        addObject(display1, 300, 50);
        display1.setImage(new GreenfootImage("Level 2",20, Color.WHITE, Color.BLACK));       
        
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
        
        if(counter == 100){
            return true;
        }
        return false;
    }
    public void transitionLevel3(){
        if (sharkCounter()==true){
            World world = new Level3();
            Greenfoot.setWorld(world);
        }
    }
    
}

