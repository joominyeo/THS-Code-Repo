import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class TrackerRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrackerRobot extends Robot
{
	public TrackerRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}


	public void race41Steps(int distance)
	{
	   for (int x=1; x<=distance; x++)
	   {
	       step();
	   }
    }

    public void task()
	{
        step();
        step();
        step();
        step();
    }
    public void step()
   {
       if (nextToABeeper())
       {
           turnRight();
        }
       if (!frontIsClear())
       {
           turnLeft();
        }
       if (frontIsClear())
       {
           move();
        }
   }
   
   //any other methods you need here
   public void turnRight()
   {
       turnLeft();
       turnLeft();
       turnLeft();
    }
   
   
   
   
   
   
   
   
   
}
