import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel00 here.
 * 
 * @author Your NAME
 * @version (a date)
 */
public class Karel00 extends Robot
{
    public Karel00(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }
    
    public void task()
    {
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
}
