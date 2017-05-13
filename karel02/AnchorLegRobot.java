import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class AnchorLegRobot here.
 * 
 * @author (Yeo) 
 * @version (1.0)
 */
public class AnchorLegRobot extends Robot
{
	public AnchorLegRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num,Color.pink);
	}
	
	public void task()
	{
	    pickBeeper();
	    turnLeft();
	    move();
	    turnRight();
	    move();
	    turnLeft();
	    move();
	    turnLeft();
	    move();
	    turnRight();
	    move();
	    turnRight();
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
	    move();
	    turnRight();
	    move();
	    turnRight();
	    move();
	    move();
	    move();
	    turnLeft();
	    move();
	    turnLeft();
	    move();
	    turnRight();
	    move();
	    turnLeft();
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
