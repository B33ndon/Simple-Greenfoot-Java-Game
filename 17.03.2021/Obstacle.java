import greenfoot.*;

public class Obstacle extends Actor
{
    MyWorld thisGame; // instance of MyWorld[obj]
    int i = 0;
    public void movement(int x)
    {
        move(x);
    }
    public void initRocks()
    {
        movement(thisGame.speed);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            return;
        }
    }
    public Obstacle()
    {
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
        //rotate();
    }
    public void act() 
    {
        initRocks();
    }
}
