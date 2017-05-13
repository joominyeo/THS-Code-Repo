import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionRobot_3 extends FunctionRobot_2
{
    public FunctionRobot_3(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }
//  returns true if Robot is on a corner with a wall to its Right
//  return false otherwise (i.e., there is NO wall on the Right)
//  Robots maintians current direction
    public boolean wallOnRight()
    {
        turnRight();
        if (frontIsClear())
        {
            turnLeft();
            return false;
        }
        turnLeft();
        return true;
    }

//  returns true if Robot is on a corner with a wall to its Left
//  return false otherwise (i.e., there is NO wall on the Left)
//  Robots maintians current direction
    public boolean wallOnLeft()
    {
        turnLeft();
        if (frontIsClear())
        {
            turnRight();
            return false;
        }
        turnRight();
        return true;
    }

//  returns true if Robot is on a corner with a wall to its Left and a wall to its Right
//  return false otherwise (i.e., there is NO wall on the Left OR NO wall on its right)
//  Robots maintians current direction
    public boolean wallOnLeftAndWallOnRight()
    {
        return wallOnLeft() && wallOnRight();
    }
//  returns true if Robot is on a corner with a wall to its Left OR a wall to its Right
//  return false otherwise (i.e., there is NO wall on the Left AND NO wall on its right)
//  Robots maintians current direction
    public boolean wallOnLeftOrWallOnRight()
    {
        return wallOnLeft() || wallOnRight();
    }
//
//
//
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
//
//
//
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
}