import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
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
        super(600, 400, 1); 
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

        Wall wall = new Wall();
        addObject(wall, 26, 150);
        Wall wall2 = new Wall();
        addObject(wall2, 133, 150);
        Wall wall3 = new Wall();
        addObject(wall3, 145, 150);
        Wall wall4 = new Wall();
        addObject(wall4, 546, 150);
        Wall wall5 = new Wall();
        addObject(wall5, 455, 150);
        Wall wall6 = new Wall();
        addObject(wall6, 560, 150);

        Block block = new Block();
        addObject(block, 300, 150);
        Pizza pizza = new Pizza();
        addObject(pizza,309,39);
        Home home = new Home();
        addObject(home,552,346);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,82,350);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,297,353);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,546,246);
        pizza3.setLocation(485,253);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,122,247);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,553,54);
        pizza5.setLocation(553,52);
    }
}
