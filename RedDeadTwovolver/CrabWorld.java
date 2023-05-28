import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    public static Counter arthurCount = new Counter();
    public static Counter jhonCount = new Counter();
    private SimpleTimer contador = new SimpleTimer();
    public static GreenfootSound musicfight = new GreenfootSound("fighttheme.wav");
    private int timer;
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
//        Greenfoot.playSound("fanfare.wav");
        Crab crab = new Crab();
        addObject(crab,130,388);
        Jhon jhon = new Jhon();
        addObject(jhon,191,175);

        //        Counter counter = new Counter();
        addObject(arthurCount,44,19);
        arthurCount.setLocation(80,20);
        arthurCount.setValue(100);

        //        CopyOfCounter copyOfCounter = new CopyOfCounter();
        addObject(jhonCount,470,21);
        jhonCount.setLocation(470,19);
        jhonCount.setValue(100);

        jhon.setLocation(200,154);
        jhon.setLocation(260,107);

        jhon.setLocation(282,55);
        crab.setLocation(282,508);

        cactus cactus = new cactus();
        addObject(cactus,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus2 = new cactus();
        addObject(cactus2,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus3 = new cactus();
        addObject(cactus3,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus4 = new cactus();
        addObject(cactus4,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus5 = new cactus();
        addObject(cactus5,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus6 = new cactus();
        addObject(cactus6,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus7 = new cactus();
        addObject(cactus7,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus8 = new cactus();
        addObject(cactus8,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus9 = new cactus();
        addObject(cactus9,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        cactus cactus10 = new cactus();
        addObject(cactus10,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(370) +95);
        }
        
    public void act()
    {
    while (Greenfoot.getRandomNumber(900) < 3) {
        Worm Worm = new Worm();
        addObject(Worm,Greenfoot.getRandomNumber(540),Greenfoot.getRandomNumber(500));
 
    }
}

}

