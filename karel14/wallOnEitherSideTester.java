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
public class wallOnEitherSideTester extends junit.framework.TestCase implements Directions
{
   public  void testWallOnLeftOrWallOnRightWithWallOnBothSidesFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, North, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingNorth());
   }

   public  void testWallOnLeftOrWallOnRightWithWallOnBothSidesFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, South, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testwallOnLeftOrWallOnRightWithWallOnBothSidesFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, East, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testwallOnLeftOrWallOnRightWithWallOnBothSidesFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, West, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingWest());
    }

   public  void testwallOnLeftOrWallOnRightWithWallOnLeftFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(4, 9, North, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftOrWallRightWithWallOnLeftFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 1, South, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testwallOnLeftOrWallOnRightWithWallOnLeftFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 5, East, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftOrWallRightWithWallOnLeftFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 6, West, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingWest());
    }

   public  void testwallOnLeftOrWallOnRightWithWallOnRightOnlyFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 2, North, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingNorth());
   }

   public  void testwallOnLeftOrWallOnRightWithWallOnRightOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 3, South, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingSouth());
   }

   public  void testwallOnLeftOrWallOnRightWithWallOnRightOnlyFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 5, West, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingWest());
   }

   public  void testwallOnLeftOrWallOnRightWithWallOnRightOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 5, East, 0);

        assertEquals(true, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testwallOnLeftOrWallOnRightWithNoWallsFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, West, 0);

        assertEquals(false, karel.wallOnLeftOrWallOnRight());     
        assertEquals(true, karel.facingWest());
    }

   public  void testwallOnLeftOrWallOnRightWithNoWallsFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, East, 0);

        assertEquals(false, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testwallOnLeftOrWallOnRightWithNoWallsFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, North, 0);

        assertEquals(false, karel.wallOnLeftOrWallOnRight());
        assertEquals(true, karel.facingNorth());
    }

   public  void testwallOnLeftOrWallOnRightWithNoWallsFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, South, 0);

        assertEquals(false, karel.wallOnLeftOrWallOnRight());
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