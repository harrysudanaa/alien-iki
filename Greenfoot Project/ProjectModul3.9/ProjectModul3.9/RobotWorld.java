import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Harry Sudana) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    private int currentMaxTurnSpeed = 2;
    private int currentLevel = 1;
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
        addObject(robot,48,50);

        Block block = new Block(currentMaxTurnSpeed);
        addObject(block, 427, 145);

        // Left wall from block
        Wall wall = new Wall();
        addObject(wall, 52, 147);
        Wall wall2 = new Wall();
        addObject(wall2, 159, 147);
        Wall wall3 = new Wall();
        addObject(wall3, 230, 147);
        // Right wall from block
        Wall wall4 = new Wall();
        addObject(wall4, 627, 147);
        Wall wall5 = new Wall();
        addObject(wall5, 692, 147);
        Wall wall6 = new Wall();
        addObject(wall6, 791, 147);

        Home home = new Home();
        addObject(home, 751, 552);

        Scorepanel score = new Scorepanel();
        addObject(score, 71, 554);

        Pizza pizza = new Pizza();
        addObject(pizza, 720, 46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2, 433, 38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3, 183, 302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4, 682, 312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5, 417, 537);
    }
    private void setUpLevel() {
        if(currentLevel == 2) {
            currentMaxTurnSpeed++;
            addObject(new Block(currentMaxTurnSpeed), 427, 145);
            
            Pizza pizza = new Pizza();
            addObject(pizza, 720-20, 46+20);
            Pizza pizza2 = new Pizza();
            addObject(pizza2, 433+20, 38+20);
            Pizza pizza3 = new Pizza();
            addObject(pizza3, 183+20, 302);
            Pizza pizza4 = new Pizza();
            addObject(pizza4, 682+20, 312+20);
            Pizza pizza5 = new Pizza();
            addObject(pizza5, 417+20, 537+20);
        }
    }
}
