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
public class BinayRobotUnitTest extends junit.framework.TestCase implements Directions
{
    public void testRobot_1()
    {
        BinaryRobot karel = new BinaryRobot(1, 1, East, infinity);
        karel.task();
        
        Robot temp = new Robot(1, 7, North, 0);

        for( int k = 0; k < 22; k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testRobot_2()
    {
        BinaryRobot karel = new BinaryRobot(2, 1, East, infinity);
        karel.task();
        
        Robot temp = new Robot(2, 7, North, 0);

        for( int k = 0; k < 13; k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testRobot_3()
    {
        BinaryRobot karel = new BinaryRobot(3, 1, East, infinity);
        karel.task();
        
        Robot temp = new Robot(3, 7, North, 0);

        for( int k = 0; k < 31; k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testRobot_4()
    {
        BinaryRobot karel = new BinaryRobot(4, 1, East, infinity);
        karel.task();
        
        Robot temp = new Robot(4, 7, North, 0);

        for( int k = 0; k < 10; k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testRobot_5()
    {
        BinaryRobot karel = new BinaryRobot(5, 1, East, infinity);
        karel.task();
        
        Robot temp = new Robot(5, 7, North, 0);

        assertEquals(false, temp.nextToABeeper());
    }

    static {
        World.reset();
        World.readWorld("binaryWorldTester.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
         World.setDelay(1);  
         World.showSpeedControl(true);
//         World.setVisible(true);
         World.setVisible(false);
    }
}