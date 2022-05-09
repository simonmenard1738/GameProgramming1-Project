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
    static GreenfootSound music2 = new GreenfootSound("bgmusic2.wav");
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
        addObject(submarine,200,560);
        Exit exit = new Exit();
        addObject(exit, 330, 50);
    }
    public void act(){
        showHealthLevel();
        Shark shark = new Shark();
        shark.x = 4;
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
        
            Heart heart = new Heart();
            addObject(heart, 40,50);
            Heart heart2 = new Heart();
            addObject(heart2, 85,50);
            Heart heart3 = new Heart();        
            addObject(heart3, 130,50);
        
        if(health == 2){
            
            DeadHeart dh = new DeadHeart();
            addObject(dh, 130, 50);
        }
        if(health == 1){
            DeadHeart dh = new DeadHeart();
            addObject(dh, 130, 50);
            DeadHeart dh2 = new DeadHeart();
            addObject(dh2, 85, 50);
        }

        transitionGameOverWorld();
        transitionLevel3();
        
        GameOverWorld.stopped4();
        MyWorld.stopped1();
        music2.playLoop();
    }
    public void showHealthLevel(){
        Display display1 = new Display();
        addObject(display1, 215, 50);
        display1.setImage(new GreenfootImage("Level 2",30, Color.WHITE, Color.BLACK));       
        
        /*Display display2 = new Display();
        addObject(display2,100, 50);
        display2.setImage(new GreenfootImage("Lives: " + health, 20,Color.WHITE, Color.BLACK));*/
    }
    public void transitionGameOverWorld(){
        if(health ==0){
            World world = new GameOverWorld();
            Greenfoot.setWorld(world);
            music2.stop();
     }
    }
    public boolean sharkCounter(){
        
        if(counter == 20){
            return true;
        }
        return false;
    }
    public void transitionLevel3(){
        if (sharkCounter()==true){
            World world = new Level3();
            Greenfoot.setWorld(world);
            music2.stop();
        }
    }
    
    public static void started2(){
        music2.playLoop();
    }
    
    public static void stopped2(){
        music2.stop();
    }
    
}

