import greenfoot.*;
//In order to use a list in java, we must import it
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkForLeafCollision();
    }
    
    /**
     * remove a leaf if we are intersecting with it
     */
    private void checkForLeafCollision()
    {
        //get an object reference to a single leaf from any leaf objects we are currently
        //interesting
        //NOTE: by placing a type in braclets before the call to geron intersectingobject
        //  we***cast*** (or force) the type to change from actor to leaf
        //NOTE2 : we can do this because leaf is a subclass of actor
        Leaf someLeaf = (Leaf)getOneIntersectingObject(Leaf.class);
        
        //check that the someleaf obkect actuallt has a reference to an object
        //if it is null, that means there was no leaf intersecting the block this time around
        if (someLeaf != null)
        {
            //someleaf is not null... so now we can remove it
            
        }
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            
            //add a new leaf obkect to the world
            //1. add a reference to the world
            World myWorld = getWorld();
            //2. use the object reference to call, or use, a method on the world object
            myWorld.addObject(new Leaf(), getX(), getY());
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            // do this when the mouse is clicked. currently: nothing
            World myWorld = getWorld();
            
            myWorld.showText("mouse was clicked", 200, 200);
        }
    }
    
}
