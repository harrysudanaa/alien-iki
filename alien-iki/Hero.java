import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        // move(5)
        moveHero();
        shootLaser();
        heroCollision();
    }
    public void moveHero() {
        if(getX() == 0) {
            setLocation(1, getY());
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+3, getY());
        }
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
    public int life = 5;
    public void heroCollision() {
        if (isTouching(Enemy.class)) {
            setLocation(60, 200);
            life--;
        }
        if (life == 0) {
            getWorld().removeObject(this);
        }
    }
}
