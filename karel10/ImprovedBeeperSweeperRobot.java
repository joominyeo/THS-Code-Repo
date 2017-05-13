import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class ImprovedBeeperSweeperRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImprovedBeeperSweeperRobot extends Robot
{
	public ImprovedBeeperSweeperRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

	public void task()  
	{ 
	    moveWhilePickingUpFor5Spaces();
        turnLeft();
        move();
        turnLeft();
        moveWhilePickingUpFor5Spaces();
        turnRight();
        move();
        turnRight();
        moveWhilePickingUpFor5Spaces();
        turnLeft();
        move();
        turnLeft();
        moveWhilePickingUpFor5Spaces();
        turnRight();
        move();
        turnRight();
        moveWhilePickingUpFor5Spaces();
        turnLeft();
        move();
        turnLeft();
        moveWhilePickingUpFor5Spaces();
	}
	public void moveAndCheckBeepers4PickUp()
	{
	    if (nextToABeeper())
	    {
	        pickBeeper();
	    }
	}
	 public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveWhilePickingUpFor5Spaces()
    {
        moveAndCheckBeepers4PickUp();
        move();
        moveAndCheckBeepers4PickUp();
        move();
        moveAndCheckBeepers4PickUp();
        move();
        moveAndCheckBeepers4PickUp();
        move();
        moveAndCheckBeepers4PickUp();
    }
}
