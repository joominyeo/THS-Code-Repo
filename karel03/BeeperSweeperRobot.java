import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class BeeperSweeperRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeperSweeperRobot extends Robot
{
    public BeeperSweeperRobot(int st, int ave, Direction dir, int num)
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
    
// write any helper methods below that demonstrate step wise refinement
//  note that I've given you turnRight() as a model on how to write new methods
        
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveWhilePickingUpFor5Spaces()
    {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }}
