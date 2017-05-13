import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class GuardRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuardRobot extends Robot
{
    public GuardRobot(int st, int ave, Direction dir, int num, Color c)
    {
        super(st, ave, dir, num, c);
    }

    public void task()
    {
      moveForward5AndTurn();
      moveForward2AndTurn();
      moveForward5AndTurn();
      moveForward2AndTurn();
      moveForward5AndTurn();
      moveForward2AndTurn();
      moveForward5AndTurn();
      moveForward2AndTurn();
      moveForward5AndTurn();
      moveForward2AndTurn();
    }
    
    public void moveForward5AndTurn()
    {
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        
    }

    public void moveForward2AndTurn()
    {
        move();
        move();
        turnLeft();
        
    }
}
