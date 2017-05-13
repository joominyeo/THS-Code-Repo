import kareltherobot.*;
import java.awt.Color;
import java.util.*;

/**
 * Write a description of class Karel00 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GleaningRobot extends MinerRobot
{
	public GleaningRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

	public void task()
	{
	    processCorner();
	    while (!atEndOfMine())
	    {
	        if (!frontIsClear())
	        {
	            turnLeft();
	           }
	        if (!frontIsClear())
	        {
	            turnAround();
	           }
	        move();
	        processCorner();
	       }
	       turnAround();
	       escape();
	   
	   
	}
	
	public void escape()
	{
	    while (frontIsClear())
        {
            turnRight();
            sweepTwoRows();
            turnRight();
            if (frontIsClear())
            {
                move();
            }
        }
        if ((!frontIsClear())&wallOnRight())
        {
            turnLeft();
            while (frontIsClear())
            {
                while (nextToABeeper())
                {
                    pickBeeper();
                }
                move();
            }
            turnRight();
        }
        if (!frontIsClear()&wallOnLeft())
        {
            turnRight();
            while (frontIsClear())
            {
                while (nextToABeeper())
                {
                    pickBeeper();
                }
                move();
            }
            turnLeft();
        }
    }
    
    public void sweepTwoRows()
    {
        while (frontIsClear())
        {
            while (nextToABeeper())
            {
                pickBeeper();
            }
            move();
        }
        turnLeft();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        move();
        turnLeft();
        while (frontIsClear())
        {
            while (nextToABeeper())
            {
                pickBeeper();
            }
            move();
        }
    }

	public boolean atEndOfMine()
	{
        return wallOnLeftAndWallOnRight() && !frontIsClear();
	}
	
	public void processCorner()
	{
	    while (nextToABeeper())
	    {
	        pickBeeper();
	       }
	   }
}
