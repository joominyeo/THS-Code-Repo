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
public class wallOnRightTester extends junit.framework.TestCase implements Directions
{
   public  void testWallOnRightWithWallOnRightOnlyFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 2, North, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingNorth());
   }

   public  void testWallOnRightWithWallOnRightOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(8, 1, South, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnRightWithWallOnRightOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 5, East, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingEast());
   }

   public  void testWallOnRightWithWallOnRightOnlyFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 6, West, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingWest());
   }

   public  void testWallOnRightWithWallOnBothSidesFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, North, 0);

        assertEquals(true, karel.wallOnRight());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnRightWithWallOnBothSidesFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, South, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnRightWithWallOnBothSidesFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, East, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingEast());
   }
 
   public  void testWallOnRightWithWallOnBothSidesFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, West, 0);

        assertEquals(true, karel.wallOnRight());
        assertEquals(true, karel.facingWest());
   }

   public  void testWallOnRightWithWallOnLeftOnlyFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(4, 2, North, 0);

        assertEquals(false, karel.wallOnRight());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnRightWithWallOnLeftOnlyFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(2, 2, West, 0);

        assertEquals(false, karel.wallOnRight());
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnRightWithWallOnLeftOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 6, East, 0);

        assertEquals(false, karel.wallOnRight());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnRightWithWallOnLeftOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 9, South, 0);

        assertEquals(false, karel.wallOnRight());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnRightWithNoWallsFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, West, 0);

        assertEquals(false, karel.wallOnRight());        
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnRightWithNoWallsFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, East, 0);

        assertEquals(false, karel.wallOnRight());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnRightWithNoWallsFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, North, 0);

        assertEquals(false, karel.wallOnRight());
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnRightWithNoWallsFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(7, 2, South, 0);

        assertEquals(false, karel.wallOnRight());
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