import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmarterRobot extends Robot
{
    public SmarterRobot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }


    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void faceNorth()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }

    public void faceSouth()
    {
        while (!facingSouth())
        {
            turnLeft();
        }
    }

    public void faceWest()
    {
        while (!facingWest())
        {
            turnLeft();
        }
    }

    public void faceEast()
    {
       while (!facingEast())
        {
            turnLeft();
        }
    }
}
