import greenfoot.*;

public class Crown extends Actor
{
    public static int x;
    public static int y;
    public Crown()
    {
        GreenfootImage image = getImage();
        image.scale(x, y);
        setImage(image);
    }
    public void act() 
    {
        // code
    }    
}
