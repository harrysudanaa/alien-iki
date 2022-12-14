import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void addActorInRandomPosition(Actor actor) {
        int x = 600;
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(actor, x, y);
    }

    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero, 60, 200);

    }

    public void act() {
        spawnEnemy();
    }
    
    private int timerSpawnEnemy = 0;
    private int totalEnemySpawn = 5;
    private void spawnEnemy() {
        
        if (timerSpawnEnemy == 180) {
            addObject(new Enemy(Greenfoot.getRandomNumber(4) + 1), 599, Greenfoot.getRandomNumber(400));
            timerSpawnEnemy = 0;
            
        } else {
            timerSpawnEnemy++;
        }
    }
}
