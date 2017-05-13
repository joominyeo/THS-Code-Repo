import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class HurdlerRobot here.
 * 
 * @author (Yeo) 
 * @version (1.0)
 */
public class HurdlerRobot extends Robot
{
    public HurdlerRobot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num,Color.blue);
    }

    public void task()
    {
        pickBeeper();
        move();
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        move();
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