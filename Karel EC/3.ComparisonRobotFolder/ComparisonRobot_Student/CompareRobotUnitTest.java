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
public class CompareRobotUnitTest extends junit.framework.TestCase implements Directions
{
    public void testGeneralRobot_1()
    {
        ComparingRobot karel = new ComparingRobot(1, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(1, 1, East, 0);
           assertEquals(false, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_2()
    {
        ComparingRobot karel = new ComparingRobot(1, 8, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(1, 8, East, 0);
           assertEquals(false, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_3()
    {
        ComparingRobot karel = new ComparingRobot(3, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(3, 1, East, 0);
           assertEquals(true, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_4()
    {
        ComparingRobot karel = new ComparingRobot(3, 3, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(3, 3, East, 0);
           assertEquals(true, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_5()
    {
        ComparingRobot karel = new ComparingRobot(5, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(5, 1, East, 0);
           assertEquals(false, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_6()
    {
        ComparingRobot karel = new ComparingRobot(5, 6, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(5, 6, East, 0);
           assertEquals(true, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_7()
    {
        ComparingRobot karel = new ComparingRobot(7, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(7, 1, East, 0);
           assertEquals(false, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_8()
    {
        ComparingRobot karel = new ComparingRobot(9, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(9, 1, East, 0);
           assertEquals(true, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    public void testGeneralRobot_9()
    {
        ComparingRobot karel = new ComparingRobot(11, 1, East, 0);
        for (int k = 0; k < 5; k++)
        {
           karel = new ComparingRobot(11, 1, East, 0);
           assertEquals(false, karel.compareStreets());
        }
        assertEquals(false, karel.anyBeepersInBeeperBag());
    }

    static {
        World.reset();
        World.readWorld("TestingWorld_1.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
         World.setDelay(1);
         World.showSpeedControl(true);
//         World.setVisible(true);
         World.setVisible(false);
    }
}