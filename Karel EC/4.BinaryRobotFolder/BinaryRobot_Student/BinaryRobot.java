import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class BinaryRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinaryRobot extends Robot
{
	private int value;
    public BinaryRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	    value = 0;
	}

	public void task()
	{
	    double count= 0;
	    for (int x=4; x<=0; x--)
	    {
	        if (nextToABeeper())
	        {
	            count = count + Math.pow(2, x);
	            move();
	           }
	       }
	}
}
