import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinWordA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWordA extends World
{

    /**
     * Constructor for objects of class WinWordJ.
     * 
     */
    public WinWordA()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    
    private void prepare(){

        salir salir = new salir();
        addObject(salir,504,552);
        playagain playagain = new playagain();
        addObject(playagain,71,554);
        menub menub = new menub();
        addObject(menub,71,554);
        
        menub.setLocation(305,549);
        playagain.setLocation(103,540);
        salir.setLocation(492,549);
    }
    
    public void act(){

    }
}