import greenfoot.*;

public class PlayAgain extends Actor
{
    public PlayAgain()
    {
        GreenfootImage image = getImage();
        image.scale(55, 55);
        setImage(image);
        //rotate();
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }
    }    
}
