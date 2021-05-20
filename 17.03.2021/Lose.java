import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lose extends World
{
    MyWorld thisGame; // instance of MyWorld[obj]
    Crown thisActor;
    public Lose()
    {    
        super(600, 400, 1); // Create canvas.
        thisActor.x=30;
        thisActor.y=30;
        if(thisGame.state=true)
        {
            showText("You Lost!", 300, 200);
            showText("Your Score: " + thisGame.score, 300, 220);
            if (thisGame.score>=150)
            {
                addObject(new Crown(), 410, 220);
            }
            showText("Click the obstacle to play again!", 300, 320);
        }else
        {
            showText("Something went wrong! Please restart app by clicking the snake...", 300, 200);
            showText("Click the obstacle to try again...", 300, 320);
        }
        addObject(new PlayAgain(), 300, 270);
    }
}
