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
    private GreenfootImage gameover = new GreenfootImage("gameover.png");;
    private int lives;
    private int pizzaEaten;
    private int score;
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
        showStatus();
        //animate();
    }
    private void robotMovement() {
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 3);
            animate();
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 3);
            animate();
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 3, getY());
            animate();
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 3, getY());
            animate();
        }
    }
    private void detectWallCollision() {
        if (isTouching(Wall.class)) {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
        
    }
    private void detectBlockCollision() {
        if (isTouching(Block.class)) {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    private void detectHome() {
        if (getWorld().getObjects(Pizza.class).size() == 0) {
            // if all pizza eaten
            if(isTouching(Home.class)) {
                increaseScore();
                setLocation(48, 50);
                Greenfoot.playSound("yipee.wav");
                pizzaEaten = 0;
            }
        }
    }
    private void eatPizza() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    private void animate() {
        if(getImage() == robotImage1) {
            setImage(robotImage2);
        } else {
            setImage(robotImage1);
        }
    }
    private void removeLife() {
        lives--;
        showStatus();
        testEndGame();
    }
    private void testEndGame() {
        if(lives == 0) {
            setImage(gameover);
            Greenfoot.stop();
        }
    }
    private void increaseScore() {
        if(isTouching(Home.class)) {
            score++;
            score += pizzaEaten;
            showStatus();
        }
    }
    private void showStatus() {
        getWorld().showText("Score : " + score, 71, 540);
        getWorld().showText("Lives : " + lives, 71, 570);
        //getWorld().showText("Pizza Eaten : " + pizzaEaten, 71, 500);
    }
}
