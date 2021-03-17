import greenfoot.*;

public class MyWorld extends World
{
    public static int score = 0;
    public static int speed = -10;
    public static int lives = 3;
    public static boolean state = true; // true=player lost, false=ongoing instance
    public int randInt(int n)
    {    
        return Greenfoot.getRandomNumber(n); // Create my own random integer function
    }
    // add +10 text and remove after 2 seconds
    // edit hitbox to make it smaller
    int x = 599;
    int dis = 65;
    public void spawnItems()
    {
        int i = 0;
        int n = randInt(26);
        int rand = randInt(100);
        while(i<=3)
        {
            //int num = randInt(400);
            //addObject(new Rock(), 600, num); // class,x,y // Add a rock to the canvas
            i++;
            if(i==1)
            {
                // check one
                if(rand >= 80 && rand <= 81)
                {
                    addObject(new powerUp1(), x, randInt(dis)); // powerup
                }
                else
                {
                    addObject(new Obstacle(), x, randInt(dis)); // rock
                }
                // check two
                if(rand >= 20 && rand <= 22)
                {
                    addObject(new powerUp1(), x, randInt(dis)+100); // powerup
                }
                else
                {
                    addObject(new Obstacle(), x, randInt(dis)+100); // rock
                }
                // check three
                if(rand >= 40 && rand <= 43)
                {
                    addObject(new powerUp1(), x, randInt(dis)+200); // powerup
                }
                else
                {
                    addObject(new Obstacle(), x, randInt(dis)+200); // rock
                }
                // check four
                if(rand >= 0 && rand <= 5)
                {
                    addObject(new powerUp1(), x, randInt(dis)+300); // powerup
                }
                else
                {
                    addObject(new Obstacle(), x, randInt(dis)+300); // rock
                }
            }
        }
        score++;
    }
    public MyWorld()
    {    
        super(600, 400, 1); // Create canvas.
        score = 0; // Reset score to 0 on app refresh
        lives = 3; // Reset lives to 3 on app refresh
        state = false;
        addObject(new Player(), 50, 200); // Add the player to the canvas
    }
    public void valueEngine()
    {
        // This engine regards score events, life events and misc events
        
        // If rocks are not present
        if (getObjects(Obstacle.class).isEmpty())
        {
            spawnItems();
        }
        
        // Speed incrementals
        if (score==10)
        {
            speed=-13; // Starting speed is 13 (nth is 2)
        }
        if (score==35)
        {
            speed=-15;
        }
        if (score==50)
        {
            speed=-17;
        }
        if (score==100)
        {
            // change background color
        }
        
        // Life events
        Lose lose = new Lose();
        if (lives==0){ // If player loses all lives
            state=true;
            Greenfoot.setWorld(lose);
            return;
        }
    }
    public void act()
    {
        showText("Score: " + score, 50, 25);
        showText("Lives: " + lives, 150, 25); // var,x,y
        valueEngine();
    }
}