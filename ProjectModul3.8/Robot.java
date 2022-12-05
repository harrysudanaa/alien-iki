import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage robotImage1;
    private GreenfootImage robotImage2;
    public int lives;
    public int pizzaEaten;
    World world = getWorld();
    Robot() {
        robotImage1 = new GreenfootImage("man01.png");
        robotImage2 = new GreenfootImage("man02.png");
        lives = 3;
        pizzaEaten = 0;
    }
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        animate();
    }
    public void robotMovement() {
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 3);
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 3, getY());
        }
    }
    public void detectWallCollision() {
        if (isTouching(Wall.class)) {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
        }
        
    }
    public void detectBlockCollision() {
        if (isTouching(Block.class)) {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome() {
        if (world.getObjects(Pizza.class).size() == 0) {
            // if all pizza eaten
            if(isTouching(Home.class)) {
                setLocation(48, 50);
                Greenfoot.playSound("yipee.wav");
            }
        }
    }
    public void eatPizza() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    public void animate() {
        if(getImage() == robotImage1) {
            setImage(robotImage2);
        } else {
            setImage(robotImage1);
        }
    }
}
