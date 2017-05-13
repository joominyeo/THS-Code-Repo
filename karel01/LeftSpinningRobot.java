import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class LeftSpinningRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftSpinningRobot extends Robot
{
    public LeftSpinningRobot(int st, int ave, Direction dir, int num, Color c)
    {
        super(st, ave, dir, num, c);
    }
    

    public void task()
    {
        spinLeft();
 
    }
    public void spinLeft()
    {
        turnLeft();
        
       
        
    }
    // write any helper methods below that demonstrate step wise refinement
        
}
