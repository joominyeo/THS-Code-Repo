import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class UpAndUnderRobot here.
 * 
 * @author (Yeo) 
 * @version (1.0)
 */
public class UpAndUnderRobot extends Robot
{
    public UpAndUnderRobot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num,Color.green.brighter());
    }
    
    public void task()
    {
        pickBeeper();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        putBeeper();

    }
    
// write any helper methods below that demonstrate step wise refinement
//  note that I've given you turnRight() as a model on how to write new methods
        
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
