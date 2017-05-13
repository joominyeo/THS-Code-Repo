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
public class wallOnLeftTester extends junit.framework.TestCase implements Directions
{
   // test wall on side methods

   public  void testWallOnLeftWithWallOnLeftOnlyFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(4, 2, North, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftWithWallOnLeftOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 1, South, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnLeftWithWallOnLeftOnlyFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(2, 2, West, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftWithWallOnLeftOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 5, East, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftWithWallOnLeftAndRightFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, East, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftWithWallOnLeftAndRightFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(1, 2, West, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftWithWallOnLeftAndRightFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, North, 0);

        assertEquals(true, karel.wallOnLeft());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftWithWallLeftAndRightSidesFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 2, South, 0);

        assertEquals(true, karel.wallOnLeft());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnLeftWithNoWallsFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 4, East, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftWithNoWallsFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 4, West, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftWithNoWallsFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 4, North, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftWithNoWallsFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(9, 4, South, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingSouth());
    }

   public  void testWallOnLeftWithWallOnRightFacingNorth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(8, 8, North, 0);

        assertEquals(false, karel.wallOnLeft());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testWallOnLeftWithWallOnRightOnlyFacingEast()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 5, East, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingEast());
    }

   public  void testWallOnLeftWithWallOnRightFacingWest()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(5, 6, West, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingWest());
    }

   public  void testWallOnLeftWithWallOnRightOnlyFacingSouth()
   {
        FunctionRobot_3 karel = new FunctionRobot_3(6, 3, South, 0);

        assertEquals(false, karel.wallOnLeft());
        assertEquals(true, karel.facingSouth());
    }

    static {
        World.reset();
        World.readWorld("wallTester1.kwld"); 
        World.setDelay(2);  
        World.showSpeedControl(true);
        World.setVisible(true);
    }
}