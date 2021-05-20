import greenfoot.*;

public class choosePlayer2 extends Actor
{
    MyWorld thisGame; // instance of MyWorld[obj]
    public choosePlayer2()
    {
        GreenfootImage image = getImage();
        image.scale(50, 30);
        setImage(image);
    }
    public void act() 
    {
        thisGame.check=false; // set player check to rocket
        MyWorld w = new MyWorld();
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(w); // insert world name
        }
    }    
}
