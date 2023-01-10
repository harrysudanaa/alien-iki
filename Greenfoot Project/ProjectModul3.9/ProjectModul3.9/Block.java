import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    private int turnspeed;
    public Block(int maxturnspeed) {
        maxturnspeed = Greenfoot.getRandomNumber(maxturnspeed - (-maxturnspeed)) + 1;
        if(maxturnspeed == 0) {
            maxturnspeed = 1;
        }
    }
    public void act()
    {
        // Add your action code here.
        turnClockwise();
    }
    public void turnClockwise() {
        move(2);
        turn(15);
    }
}
