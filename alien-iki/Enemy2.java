import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    public void act() {
        // call act method in enemy class
        // super is method that calling method in parent class
        super.act();
        turn(1);
    }
}
