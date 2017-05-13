import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HanselAndGretelRobot extends SmarterRobot
{
    //don't forget to import the SmarterRobot file into this project folder
    //if you don't you will not have any access to the SmarterRobot methods - this is inheritance

    public HanselAndGretelRobot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }

    public void followAllBreadCrumbs()
    {
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        realFollowBreadCrumb();
        turnA();
        //move();
        //followBreadCrumb();
    }

    public void follow45BreadCrumbs()
    {
        followXBreadCrumbs(45);
    }

    public void follow15BreadCrumbs()
    {
        followXBreadCrumbs(15);
    }

    public void follow5BreadCrumbs(int distance)
    {
        followXBreadCrumbs(5);
    }
    
    public void turnA()
    {
        turnLeft();
        turnLeft();
    }

    public void followBreadCrumb()
    {
        if (nextToABeeper())
        {
            move();
        }
        if (!nextToABeeper())
        {
            turnLeft();
            move();
        }
    }
    
    public void followXBreadCrumbs(int distance)
    {
        for (int x=1; x<=distance; x++)
	       {
	           followBreadCrumb();
	       }
	}
	   
	public void realFollowBreadCrumb()
	{
	    while (nextToABeeper())
	    {
	        move();
	    }
	    if (!nextToABeeper())
	    {
	        turnLeft();
	        move();
	    }
	}
	
	
}
