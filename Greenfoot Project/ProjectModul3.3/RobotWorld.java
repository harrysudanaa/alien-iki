import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Harry Sudana) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,26,45);

        Block block = new Block();
        addObject(block, 400, 150);

        // Left wall from block
        Wall wall = new Wall();
        addObject(wall, 240, 150);
        Wall wall2 = new Wall();
        addObject(wall2, 50, 150);
        Wall wall3 = new Wall();
        addObject(wall3, 150, 150);
        // Right wall from block
        Wall wall4 = new Wall();
        addObject(wall4, 560, 150);
        Wall wall5 = new Wall();
        addObject(wall5, 660, 150);
        Wall wall6 = new Wall();
        addObject(wall6, 750, 150);

        Home home = new Home();
        addObject(home, 750, 510);

        Scorepanel score = new Scorepanel();
        addObject(score, 90, 510);

        Pizza pizza = new Pizza();
        addObject(pizza,396,39);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,731,54);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,392,521);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,654,272);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,114,260);
        pizza4.setLocation(702,262);
    }
}
