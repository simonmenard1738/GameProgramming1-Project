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
    int counterWp = 0;
    static GreenfootSound music3 = new GreenfootSound("bgmusic3.wav");
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
        addObject(submarine,200,560);
        Exit exit = new Exit();
        addObject(exit, 300, 50);
        
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
            Whirlpool wp = new Whirlpool();
        
        if(counterWp<6){
        if(Greenfoot.getRandomNumber(200)<2){
            int wpX = Greenfoot.getRandomNumber(getWidth());
            int wpY = Greenfoot.getRandomNumber(50);
            addObject(wp, wpX, wpY);
            counterWp++;
            
        }
    }
        transitionGameOverWorld();
        transitionGameWon();
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
            GameOverWorld.stopped4();
            Level2.stopped2();
            music3.playLoop();
    }
    public void showHealthLevel(){
        Display display1 = new Display();
        addObject(display1, 200, 50);
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
        
        if(counter == 50){
            
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
    public static void started3(){
        music3.playLoop();
    }
    public static void stopped3(){
        music3.stop();
    }
    
}
