import kareltherobot.*;
import java.awt.Color;
import java.util.*;

/**
 * Write a description of class Karel00 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinerRobot extends FunctionRobot_3
{
	public MinerRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

	public void escape()
	{
	    while (wallOnLeftOrWallOnRight())
	    {
	        if (!frontIsClear())
	        {
	            turnLeft();
	            if (!frontIsClear())
	            {
	                turnAround();
	               }
	           }
	           move();
	       }
	}
	
	public void escaping()
	{
	    while (!frontIsClear() && !wallOnRight() &&!wallOnLeft())
	    {
	    if (frontIsClear())
	    {
	        while (nextToABeeper())
	        {
	            pickBeeper();
	           }
	           move();
	       }
	       if (wallOnLeft())
	       {
	           if (frontIsClear())
	           {
	               move();
	           }
	           else
	           {
	               turnRight();
	           }
	       }
	       if (!frontIsClear())
	       {
	           if (wallOnLeft())
	           {
	               turnRight();
	           }
	           if (wallOnRight())
	           {
	               turnLeft();
	           }
	           if (wallOnLeft()&&wallOnRight())
	           {
	               turnAround();
	           }
	       }
	       if (wallOnRight())
	       {
	           if (frontIsClear())
	           {
	               move();
	           }
	           else{
	               turnLeft();
	           }
	       }
	       if (wallOnLeft() && !frontIsClear())
	       {
	           turnRight();
	           if (frontIsClear())
	           {
	               while (nextToABeeper())
	               {
	            pickBeeper();
	           }
	           move();
	       }
	       else
	       {
	           turnRight();
	       }
	   }
	   if (wallOnRight() && !frontIsClear())
	       {
	           turnLeft();
	           if (frontIsClear())
	           {
	               while (nextToABeeper())
	               {
	            pickBeeper();
	           }
	           move();
	       }
	       else
	       {
	           turnLeft();
	       }
	   }
	   

	   }
}
	
	public void turnAround()
	{
	    turnLeft();
	    turnLeft();
	}
}