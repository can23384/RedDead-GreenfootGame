import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menub extends Actor
{
    private GreenfootImage blanco = getImage();
    private GreenfootImage rojo = new GreenfootImage("menur.png");
    private boolean mauseOver = false;
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mause();       
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new menu());
        }
    }
    
    public void mause()
    {
        if (Greenfoot.mouseMoved(null))
        {
            mauseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mauseOver){
            setImage(rojo);
        }
        else
        {
            setImage(blanco);
        }
    }
}
