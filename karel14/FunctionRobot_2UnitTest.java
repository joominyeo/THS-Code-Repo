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
public class FunctionRobot_2UnitTest extends junit.framework.TestCase implements Directions
{

// 0 beepers at 3, 1   1 beeper at 3, 4   2 beepers at 3, 6  3 beepers at 2, 8   6 beepers at 3, 8
   public  void testTwoOrMoreBeepersOnCornerWithZeroBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 1, West, 0);

        assertEquals(false, karel.twoOrMoreBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testTwoOrMoreBeepersOnCornerWithOneBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 4, West, 0);

        assertEquals(false, karel.twoOrMoreBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testTwoOrMoreBeepersOnCornerWithTwoBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 6, West, 0);

        assertEquals(true, karel.twoOrMoreBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testTwoOrMoreBeepersOnCornerWithThreeBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(2, 8, West, 0);

        assertEquals(true, karel.twoOrMoreBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }


// 0 beepers at 3, 1   1 beeper at 3, 4   2 beepers at 3, 6  3 beepers at 2, 8   6 beepers at 3, 8

   public  void testExactlyTwoBeepersOnCornerWithZeroBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 1, West, 0);

        assertEquals(false, karel.exactlyTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testExactlyTwoBeepersOnCornerWithOneBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 4, West, 0);

        assertEquals(false, karel.exactlyTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testExactlyTwoBeepersOnCornerWithTwoBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 6, West, 0);

        assertEquals(true, karel.exactlyTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testExactlyTwoBeepersOnCornerWithThreeBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(2, 8, West, 0);

        assertEquals(false, karel.exactlyTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }


// 0 beepers at 3, 1   1 beeper at 3, 4   2 beepers at 3, 6  3 beepers at 2, 8   6 beepers at 3, 8

   public  void testNextToExactlyOneBeeperOnCornerWithZeroBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 1, West, 0);

        assertEquals(false, karel.nextToExactlyOneBeeper());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testNextToExactlyOneBeeperOnCornerWithOneBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 4, West, 0);

        assertEquals(true, karel.nextToExactlyOneBeeper());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testNextToExactlyOneBeeperOnCornerWithTwoBeeperonCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 6, West, 0);

        assertEquals(false, karel.nextToExactlyOneBeeper());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testNextToExactlyOneBeeperOnCornerWithThreeBeeperonCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(2, 8, West, 0);

        assertEquals(false, karel.nextToExactlyOneBeeper());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }


// 0 beepers at 3, 1   1 beeper at 3, 4   2 beepers at 3, 6  3 beepers at 2, 8   6 beepers at 3, 8

   public  void testOneOrTwoBeepersOnCornerWithZeroBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 1, West, 0);

        assertEquals(false, karel.oneOrTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testOneOrTwoBeepersOnCornerWithOneBeeperOnCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 4, West, 0);

        assertEquals(true, karel.oneOrTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testOneOrTwoBeepersOnCornerWithTwoBeeperonCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(3, 6, West, 0);

        assertEquals(true, karel.oneOrTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
   }

   public  void testOneOrTwoBeepersOnCornerWithMoreThanTwoBeeperonCorner()
   {
        FunctionRobot_2 karel = new FunctionRobot_2(2, 8, West, 0);

        assertEquals(false, karel.oneOrTwoBeepersOnCorner());        
        assertEquals(true, karel.facingWest());
        assertEquals(false, karel.anyBeepersInBeeperBag());
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