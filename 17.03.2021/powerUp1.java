import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class powerUp1 extends Actor
{
    MyWorld thisGame; // instance of MyWorld[obj]
    public void movement(int x)
    {
        move(x);
    }
    public powerUp1()
    {
        GreenfootImage image = getImage();
        image.scale(40, 40);
        setImage(image);
    }
    public void act() 
    {
        movement(thisGame.speed);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            return;
        }
    }    
}
