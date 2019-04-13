import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variable
     * (we can use these variable anywhere in the class)
     */
    int frames;

    //Create the array(list of names)
    String[] peopleInClass = {"Julio","Liam","Osman","Simon","Eric","Phillip",
            "Joven","Joe","Gordan","Nick","Jieun","Selena","Jason","Sam","Jeff"
        };

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        //Initialize instance variable
        frames = 0;

    }

    /**
     * act
     * (gets called repeatly to create animation)
     */
    public void act()
    {
        //Say "hello" to a different person each second
        if ((frames % 60 == 0) && (frames / 60 < 16) )
        {
            //Only shoe a mesage when we are in the bounds of the array
            showText("array index is:" + frames / 60, 400, 250);

            //Only say hello when we are in the bounds of the array
            //Say hello to everyone in the class!
            showText("Hello " + peopleInClass[frames / 60], 400, 170);
        }

        //tack frames
        frames += 1;

        //show the frames
        showText("" + frames, 100, 100);
    }
}