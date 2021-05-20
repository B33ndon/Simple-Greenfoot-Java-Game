import greenfoot.*;

public class choosePlayer1 extends Actor
{
    MyWorld thisGame; // instance of MyWorld[obj]
    public choosePlayer1()
    {
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
    public void act() 
    {
        thisGame.check=true; // set player check to arrow
        MyWorld w = new MyWorld();
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(w); // insert world name
        }
    }    
}
