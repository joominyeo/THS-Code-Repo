import kareltherobot.*;
import java.awt.Color;
import java.util.*;

@SuppressWarnings("unchecked")

/**
 * Write a description of class Karel00 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GleaningGoodSamaritanRobot extends GleaningRobot
{
	public GleaningGoodSamaritanRobot(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}


	public void processCorner()
	{
	    super.processCorner();
	    sendAllRobotsHome();
    }

	public void sendAllRobotsHome()
	{
	    Enumeration<MinerRobot> e= neighbors();
	    while (e.hasMoreElements())
	    {
	        MinerRobot samaritan = e.nextElement();
	        faceOppositeDirection(samaritan);
	        samaritan.escape();
	       }
	}


	public void faceOppositeDirection(MinerRobot m)
	{
	    if (facingNorth())
	    {
	        m.faceSouth();
	       }
	       else{
	           if (facingEast())
	           {
	               m.faceWest();
	           }
	           else{
	           if (facingSouth())
	           {
	               m.faceNorth();
	           }
	           else{
	               if (facingWest())
	               {
	                   m.faceEast();
	               }
	           }
	       }
	   }
	}
}