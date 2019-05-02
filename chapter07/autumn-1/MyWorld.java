import greenfoot.*;



/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
        
        //create 18 leaf objects
        for(int i = 1;i<= 18; i += 1)
        {
            //create the object
            Leaf aLeaf = new Leaf();
            
            //position
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            
            //now actually add the object to the world
            addObject(aLeaf, x, y);
        }
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }
    
  
}
