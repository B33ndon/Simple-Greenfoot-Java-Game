import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lose extends World
{
    MyWorld thisGame; // instance of MyWorld[obj]
    public Lose()
    {    
        super(600, 400, 1); // Create canvas.
        if(thisGame.state=true)
        {
            showText("You Lost!", 300, 200);
        }else
        {
            showText("Something went wrong! Please restart app by clicking the snake...", 300, 200);
        }
        addObject(new PlayAgain(), 300, 270);
        showText("Click the obstacle to Play Again!", 300, 320);
    }
}
