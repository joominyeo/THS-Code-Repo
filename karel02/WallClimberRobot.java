import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class WallClimberRobot here.
 * 
 * @author (Yeo) 
 * @version (1.0)
 */
public class WallClimberRobot extends Robot
{
	public WallClimberRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num,Color.black.brighter());
	}
	
	public void task()
	{
	    pickBeeper();
	    turnLeft();
	    move();
	    move();
	    move();
	    move();
	    move();
	    turnRight();
	    move();
	    turnRight();
	    move();
	    move();
	    move();
	    move();
	    move();
	    turnLeft();
	    move();
	    move();
	    move();
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
