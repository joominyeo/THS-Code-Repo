/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver1 implements Directions
{
    public static void main(String args[])  {
// TrackerRobot that test turning Right at Beeper
        TrackerRobot karel_B1 = new TrackerRobot(8, 1, North, 0);
        karel_B1.task();

        TrackerRobot karel_B2 = new TrackerRobot(8, 5, West, 0);
        karel_B2.task();

        TrackerRobot karel_B3 = new TrackerRobot(2, 2, East, 0);
        karel_B3.task();

        TrackerRobot karel_B4 = new TrackerRobot(6, 2, South, 0);
        karel_B4.task();

// TrackerRobot that test turning Leftt when front is block
        TrackerRobot karel_L1 = new TrackerRobot(6, 3, North, 0);
        karel_L1.task();

        TrackerRobot karel_L2 = new TrackerRobot(7, 3, East, 0);
        karel_L2.task();

        TrackerRobot karel_L3 = new TrackerRobot(3, 10, West, 0);
        karel_L3.task();

        TrackerRobot karel_L4 = new TrackerRobot(5, 9, South, 0);
        karel_L4.task();
   } 

    static {
        World.reset(); 
        World.readWorld("OrienteeringTest.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}