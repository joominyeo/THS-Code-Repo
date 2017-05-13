import kareltherobot.*;
import java.awt.Color;
import java.util.*;
import junit.framework.*;

/**
 * The test class Function_3UnitTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Function_3UnitTester extends junit.framework.TestCase implements Directions
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
        World.setDelay(1);
        World.showSpeedControl(true);
        World.setVisible(true);
    }
}