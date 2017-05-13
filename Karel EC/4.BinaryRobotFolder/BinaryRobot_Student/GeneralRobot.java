import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class BinaryRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneralRobot extends Robot
{
	private int value;
	private int numBase;
    public GeneralRobot(int st, int ave, Direction dir, int numBeeper, int base)
	{
	    super(st, ave, dir, numBeeper);
	    numBase = base;
	    value = 0;
	}

	public void task()
	{
	}

	public int getBase()  // do not modify this method!
	{
	    return numBase;
	}
}
