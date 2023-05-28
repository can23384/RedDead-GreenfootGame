import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        prepare();
    }
    
    private void prepare(){

        salir salir = new salir();
        addObject(salir,504,552);
        jugar jugar = new jugar();
        addObject(jugar,71,554);
        jugar.setLocation(103,549);
        salir.setLocation(492,549);
    }
    
    public void act(){

    }
}
