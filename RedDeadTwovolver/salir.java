import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salir extends Actor
{
    private GreenfootSound musicmenu = new GreenfootSound("menu.wav");
    private GreenfootImage blanco = getImage();
    private GreenfootImage rojo = new GreenfootImage("exit.png");
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
            Greenfoot.stop();
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
