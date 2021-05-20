import greenfoot.*;

public class Exit extends Actor
{
    public Exit()
    {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }    
}
