import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class RightSpinningRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightSpinningRobot extends Robot
{
    public RightSpinningRobot(int st, int ave, Direction dir, int num, Color c)
    {
        super(st, ave, dir, num, c);
    }
    

    public void task()
    {
        turnRight();
    }
    
       
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();

    }
}
