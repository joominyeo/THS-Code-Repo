import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel15-1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewAndImprovedBeeperSweeperRobot extends SmarterRobot
{
    public NewAndImprovedBeeperSweeperRobot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }

    public void taskMainDriver1()  // reimplement your task method using stepwise refinement!
    {
        checkRowForAnyBeepers();
        turnRightCheckingForBeepers();
        checkRowForAnyBeepers();
        turnLeftCheckingForBeepers();
        checkRowForAnyBeepers();
        turnRightCheckingForBeepers();
        checkRowForAnyBeepers();
        turnLeftCheckingForBeepers();
        checkRowForAnyBeepers();
    }
    
    public void taskMainDriver2()
    {
        sweepAnyRow();
        repeatRestOfSweepAnyRow(10);
    }
    
    public void taskMainDriverEscape()
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
    
    public void checkRowForAnyBeepers()
    {
        while (frontIsClear())
        {
            while (nextToABeeper())
            {
                pickBeeper();
            }
            move();
        }
    }
    
    public void turnRightCheckingForBeepers()
    {
        if (!wallOnRight())
        {
            while (nextToABeeper())
        {
            pickBeeper();
        }
        turnRight();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        move();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        turnRight();
        }
    }
    
    public void turnLeftCheckingForBeepers()
    {
        if (!wallOnLeft())
        {
            while (nextToABeeper())
        {
            pickBeeper();
        }
        turnLeft();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        move();
        while (nextToABeeper())
        {
            pickBeeper();
        }
        turnLeft();
        }
    }
    
    public void sweepAnyRow()
    {
        while (frontIsClear())
        {
            while (nextToABeeper())
            {
                pickBeeper();
            }
            move();
        }
    }
    
    public void repeatRestOfSweepAnyRow(int num)
    {
        for (int x=1; x<=num; x++)
        {
            restOfSweepAnyRow();
        }
    }
    
    public void restOfSweepAnyRow()
    {
        if (!frontIsClear())
        {
            turnLeftCheckingForBeepers();
        }
        if (frontIsClear())
        {
            sweepAnyRow();
        }
        if (!frontIsClear())
        {
            turnRightCheckingForBeepers();
        }
        if (frontIsClear())
        {
            sweepAnyRow();
        }
    }
}
