import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionRobot_1 extends SmarterRobot
{
	public FunctionRobot_1(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

//  return the number of left turns needed to have this Robot face North
//  Robots current direction is NOT changed!
	public int numberOfLeftTurnsToFaceNorth()
	{
        if (facingEast())
	    return 1;
	    if (facingWest())
	    return 3;
	    if (facingSouth())
	    return 2;
	    return 0;
    }

//  return the number of left turns needed to have this Robot face South
//  Robots current direction is NOT changed!
	public int numberOfLeftTurnsToFaceSouth()
	{
        if (facingEast())
	    return 3;
	    if (facingWest())
	    return 1;
	    if (facingNorth())
	    return 2;
	    return 0;
    }

//  return the number of left turns needed to have this Robot face West
//  Robots current direction is NOT changed!
	public int numberOfLeftTurnsToFaceWest()
	{
        if (facingEast())
	    return 2;
	    if (facingSouth())
	    return 3;
	    if (facingNorth())
	    return 1;
	    return 0;
    }

//  return the number of left turns needed to have this Robot face East
//  Robots current direction is NOT changed!
	public int numberOfLeftTurnsToFaceEast()
	{
        if (facingWest())
	    return 2;
	    if (facingSouth())
	    return 1;
	    if (facingNorth())
	    return 3;
	    return 0;
    }
}