import greenfoot.*;

public class Player1 extends Actor
{
    public Player1()
    {
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
    
    MyWorld thisGame; // instance of MyWorld[obj]
    public void act() 
    {
         // get mouse location
         MouseInfo mouse = Greenfoot.getMouseInfo();
         if(Greenfoot.mouseMoved(null) || Greenfoot.mouseDragged(null))
         {  
               var mx = mouse.getX();  
               var my = mouse.getY();
               turnTowards(mx,my);
               setLocation(50, my - 20);
         }
         
         // when player touches rock
         Actor objRock = getOneIntersectingObject(Obstacle.class);
         if(objRock!=null)
         {
             getWorld().removeObject(objRock);
             thisGame.lives--;
             return;
         }
         
         //when player touches power up
         Actor objPowerUp = getOneIntersectingObject(powerUp1.class);
         if(objPowerUp!=null)
         {
             getWorld().removeObject(objPowerUp);
             thisGame.score+=3;
             return;
         }
    }
}
