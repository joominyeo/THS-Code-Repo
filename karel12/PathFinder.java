
/**
 * Write a description of class PathFinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PathFinder extends SmarterRobot
{

	public PathFinder(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

	public void demoFinished()
	{
	    turnAround();
	    move();
	    put7Beepers();
	    move();
	}

	public void put7Beepers()
	{
	    putBeeper();
	    putBeeper();
	    putBeeper();
	    putBeeper();
	    putBeeper();
	    putBeeper();
	    putBeeper();
	}

	public void followPath()
	{
	    collectTwoBeepers();
	    traverseHallway();
	    moveThroughLongHallways();
	    switchBacks();
	    goEastYoungMan();
	    follow2ndHalfPath();
	}

	public void follow2ndHalfPath()
	{
	    westAgain();
	    southAndNorth();
	    goWest();
	    homeStretch();
	}

	public void homeStretch()
	{
	    move4();
	    move4();
	    pickBeeper();
	    pickBeeper();
	}
	
	public void goWest()
	{
	    faceSouth();
	    faceWest();
	    move4();
	    turnRight();
	    move();
	    move2();
	    faceEast();
	    move();
	    faceSouth();
	    left2U_Turn();
	    rightU_Turn();
	    left2U_Turn();
	    faceEast();
	    move();
	    faceSouth();
	    pickBeeper();
	}

	public void rightU_Turn()
	{
	    turnRight();
	    move();
	    turnRight();
	}

	public void left2U_Turn()
	{
	    move2();
	    turnLeft();
	    move();
	    turnLeft();
	    move2();
	}

	public void southAndNorth()
	{
	    faceSouth();
	    move4();
	    turnLeft();
	    move();
	    faceNorth();
	    move4();
	    move();
	}

	public void westAgain()
	{
	    faceNorth();
	    move();
	    turnRight();
	    move2();
	    move();
	}

	public void goEastYoungMan()
	{
	    faceEast();
	    move();
	    move2();
	    faceSouth();
	    move();
	    move4();
	    faceEast();
	    move();
	    faceNorth();
	    move4();
	    move();
	    faceEast();
	    move();
	    faceNorth();
	    faceSouth();
	    move();
	    move4();
	    faceEast();
	    move();
	}
	   
	public void switchBacks()
	{
	    faceNorth();
	    move();
	    faceWest();
	    faceEast();
	    move2();
	    faceNorth();
	    move();
	    faceEast();
	    faceWest();
	    move2();
	    faceSouth();
	    faceNorth();
	    move();
	    pickBeeper();
	}

	public void moveThroughLongHallways()
	{
	    faceNorth();
	    move2();
	    move();
	    faceWest();
	    moveDiagonalLeft();
	    move4();
	    move();
	    faceNorth();
	    move2();
	    move();
	    turnRight();
	    turnAround();
	    move2();
	}

	public void traverseHallway()
	{
	    faceEast();
	    moveDiagonalLeft();
	    moveDiagonalRight();
	    moveDiagonalLeft();
	    moveDiagonalRight();
	    moveDiagonalLeft();
	    moveDiagonalRight();
	    move();
	}

	public void moveDiagonalLeft()
	{
	    move();
	    turnLeft();
	    move();
	    turnRight();
	}

	public void moveDiagonalRight()
	{
	    move();
	    turnRight();
	    move();
	    turnLeft();
	}

	public void collectTwoBeepers()
	{
	    faceNorth();
	    move4();
	    pickBeeper();
	    turnRight();
	    move();
	    faceSouth();
	    move4();
	    pickBeeper();
	}

	public void move4()
	{
	    move2();
	    move2();
	}

	public void move2()
	{
	    move();
	    move();
	}
}
