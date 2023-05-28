import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Actor
{
    
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(20);
        eat();
        borrar();
        
    }
    
    public void eat()
    {
        Actor Crab;
        Actor Blob;
        Blob = getOneObjectAtOffset(0, 0, Blob.class);
        Crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (Crab != null)
        {
            CrabWorld.arthurCount.add(-2);
            Greenfoot.playSound("dano.wav");
            getWorld().removeObject(Blob);
            if (CrabWorld.arthurCount.getValue() == 0)
            {
                getWorld().removeObject(Crab);
                CrabWorld.musicfight.stop();
                Greenfoot.playSound("jhonwin.wav");
                Greenfoot.setWorld(new WinWordJ());
            }
        }
        
        Actor Jhon;
        Jhon = getOneObjectAtOffset(0, 0, Jhon.class);
        if (Jhon != null)
        {
            CrabWorld.jhonCount.add(-2);
            Greenfoot.playSound("dano.wav");
            if (CrabWorld.jhonCount.getValue() == 0)
            {
                getWorld().removeObject(Jhon);
                CrabWorld.musicfight.stop();
                Greenfoot.playSound("arthur win.wav");
                Greenfoot.setWorld(new WinWordA());
            }
        }
    }
    
    public void borrar()
    {
        Actor cactus = getOneIntersectingObject(cactus.class);
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            getWorld().removeObject(this);
        }
        else if (getY() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            getWorld().removeObject(this);
        }
        else if (cactus != null)
        {
            getWorld().removeObject(this);
        }
    }

}
