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
public class GeneralRobotUnitTest extends junit.framework.TestCase implements Directions
{
    public void testGeneralRobot_1()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(1, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(1, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(1, 11, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_2()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(2, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(2, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(2, 10, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_3()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(3, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(3, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(3, 9, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_4()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(4, 1, East, infinity);
        setupBot.task();
        
        GeneralRobot karel = new GeneralRobot(4, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(4, 12, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_5()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(5, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(5, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(5, 11, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_6()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(6, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(6, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(6, 10, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_7()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(7, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(7, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(7, 9, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_8()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(8, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(8, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(8, 10, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_9()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(9, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(9, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(9, 11, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    public void testGeneralRobot_10()
    {
        TestingGeneralRobot setupBot = new TestingGeneralRobot(10, 1, East, infinity);
        setupBot.task();

        GeneralRobot karel = new GeneralRobot(10, 1, East, infinity, setupBot.getBase());
        karel.task();
        
        Robot temp = new Robot(10, 12, North, 0);

        for( int k = 0; k < setupBot.getValue(); k++)
        {
           assertEquals(true, temp.nextToABeeper());
           temp.pickBeeper();
        }
        assertEquals(false, temp.nextToABeeper());
    }

    static {
        World.reset();
        World.readWorld("TestingWorld.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
         World.setDelay(1);  
         World.showSpeedControl(true);
//         World.setVisible(true);
         World.setVisible(false);
    }
}