import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy() {
        setRotation(180);
    }
    public Enemy(int speed) {
        setRotation(180);
        this.speed = speed;
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    public void act()
    {
        // Add your action code here.
        moveEnemy();
        // shootLaser();
        // remove the enemy when the enemy is at edge of the world
        
    }
    public int timerShoot = 0;
    public void shootLaser() {
        if (timerShoot == 30) {
            getWorld().addObject(new Laser(), getX() + 70, getY());
            timerShoot = 0;
        } else {
            timerShoot++;
        }
        
    }
    public void moveEnemy() {
        move(speed);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
