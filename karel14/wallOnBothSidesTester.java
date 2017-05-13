import kareltherobot.*;
import java.awt.Color;
import java.util.*;
import junit.framework.*;

/**
 * The test class wallTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class wallOnBothSidesTester extends junit.framework.TestCase implements Directions
{
   public  void testWallOnLeftAndWallOnRightWithWallOnBothSidesFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, North, 0);

        assertEquals(true, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingNorth());
   }

   public  void testWallOnLeftAndWallOnRightWithWallOnBothSidesFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, South, 0);

        assertEquals(true, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnLeftAndWallOnRightWithWallOnBothSidesFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, East, 0);

        assertEquals(true, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testWallOnLeftAndWallOnRightWithWallOnBothSidesFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, West, 0);

        assertEquals(true, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftOrWallOnRightWithWallOnLeftFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(4, 9, North, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftAndWallRightWithWallOnLeftFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 1, South, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnLeftOrWallOnRightWithWallOnLeftFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 5, East, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftAndWallRightWithWallOnLeftFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 6, West, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftAndWallOnRightWithWallOnRightOnlyFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 2, North, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingNorth());
   }

   public  void testWallOnLeftAndWallOnRightWithWallOnRightOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 3, South, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingSouth());
   }

   public  void testWallOnLeftAndWallOnRightWithWallOnRightOnlyFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 5, West, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingWest());
   }

   public  void testWallOnLeftAndWallOnRightWithWallOnRightOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 5, East, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testWallOnLeftAndWallOnRightWithNoWallsFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, West, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());     
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftOrWallOnRightWithNoWallsFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, East, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testWallOnLeftOrWallOnRightWithNoWallsFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, North, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftOrWallOnRightWithNoWallsFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, South, 0);

        assertEquals(false, karel.wallOnLeftAndWallOnRight());
        assertEquals(true, karel.facingSouth());
    }

    static {
        World.reset();
        World.readWorld("wallTester1.kwld"); 
         World.setDelay(3);  
         World.showSpeedControl(true);
         World.setVisible(true);

    }
}