
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import kareltherobot.*;

public class MazeWalker extends Robot

{
	// instance variables - replace the example below with your own
	

	/**
	 * Constructor for objects of class MazeWalker
	 */
	public MazeWalker(int st, int ave, Direction dir, int beeps)
	{
	    super (st,ave,dir,beeps);
	   }
	
	
	
	public void followWallRight()
	{
	    if (frontIsClear())
	    {
	        move();
	        if (!wallOnRight())
	        {
	            turnRight();
	            move();
	            if (!wallOnRight())
	            {
	               turnRight();
	               move();
	               }
	           }
	       }
	    else{
	        turnLeft();
	       }
	}
	
	public void turnRight()
	{
	    turnLeft();
	    turnLeft();
	    turnLeft();
	   }
	   
	public boolean wallOnRight()
	{
	    turnRight();
	    if (!frontIsClear())
	    {
	        turnLeft();
	        return true;
	       }
	    else{
	        turnLeft();
	        return false;
	       }
	   }
}