import kareltherobot.*;
import java.awt.Color;
import java.util.*;
import junit.framework.*;

/**
 * The test class MainDriver1UnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionRobot_1UnitTest extends junit.framework.TestCase implements Directions
{
    public void testNumberOfLeftTurnsToFaceNorth()
    {
        FunctionRobot_1 karel = new FunctionRobot_1(2, 1, North, 3);

        assertEquals(0, karel.numberOfLeftTurnsToFaceNorth());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testNumberOfLeftTurnsToFaceNorth_2()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, South, 0);

        assertEquals(2, karel.numberOfLeftTurnsToFaceNorth());        
        assertEquals(true, karel.facingSouth());
    }

   public  void testNumberOfLeftTurnsToFaceNorth_3()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, East, 0);

        assertEquals(1, karel.numberOfLeftTurnsToFaceNorth());        
        assertEquals(true, karel.facingEast());
    }

   public  void testNumberOfLeftTurnsToFaceNorth_4()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, West, 0);

        assertEquals(3, karel.numberOfLeftTurnsToFaceNorth());        
        assertEquals(true, karel.facingWest());
    }

   public  void testNumberOfLeftTurnsToFaceSouth_1()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, North, 0);

        assertEquals(2, karel.numberOfLeftTurnsToFaceSouth());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testNumberOfLeftTurnsToFaceSouth_2()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, South, 0);

        assertEquals(0, karel.numberOfLeftTurnsToFaceSouth());        
        assertEquals(true, karel.facingSouth());
    }

   public  void testNumberOfLeftTurnsToFaceSouth_3()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, East, 0);

        assertEquals(3, karel.numberOfLeftTurnsToFaceSouth());        
        assertEquals(true, karel.facingEast());
    }

   public  void testNumberOfLeftTurnsToFaceSouth_4()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, West, 0);

        assertEquals(1, karel.numberOfLeftTurnsToFaceSouth());        
        assertEquals(true, karel.facingWest());
    }

   public  void testNumberOfLeftTurnsToFaceEast_1()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, North, 0);

        assertEquals(3, karel.numberOfLeftTurnsToFaceEast());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testNumberOfLeftTurnsToFaceEast_2()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, South, 0);

        assertEquals(1, karel.numberOfLeftTurnsToFaceEast());        
        assertEquals(true, karel.facingSouth());
    }

   public  void testNumberOfLeftTurnsToFaceEast_3()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, East, 0);

        assertEquals(0, karel.numberOfLeftTurnsToFaceEast());        
        assertEquals(true, karel.facingEast());
    }

   public  void testNumberOfLeftTurnsToFaceEast_4()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, West, 0);

        assertEquals(2, karel.numberOfLeftTurnsToFaceEast());        
        assertEquals(true, karel.facingWest());
    }

   public  void testNumberOfLeftTurnsToFaceWest_1()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, North, 0);

        assertEquals(1, karel.numberOfLeftTurnsToFaceWest());        
        assertEquals(true, karel.facingNorth());
    }

   public  void testNumberOfLeftTurnsToFaceWest_2()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, South, 0);

        assertEquals(3, karel.numberOfLeftTurnsToFaceWest());        
        assertEquals(true, karel.facingSouth());
    }

   public  void testNumberOfLeftTurnsToFaceWest_3()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, East, 0);

        assertEquals(2, karel.numberOfLeftTurnsToFaceWest());        
        assertEquals(true, karel.facingEast());
    }

   public  void testNumberOfLeftTurnsToFaceWest_4()
   {
        FunctionRobot_1 karel = new FunctionRobot_1(1, 1, West, 0);

        assertEquals(0, karel.numberOfLeftTurnsToFaceWest());        
        assertEquals(true, karel.facingWest());
    }
    
    static {
        World.reset();
        World.readWorld("function1.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
         World.setDelay(1);  
         World.showSpeedControl(true);
         World.setVisible(true);

    }
}