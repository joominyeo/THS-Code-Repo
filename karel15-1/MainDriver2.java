/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver2 implements Directions
{
    public static void main(String args[])  {
     // construct your own NewAndImprovedBeeperSweeperRobot
     NewAndImprovedBeeperSweeperRobot karel = new NewAndImprovedBeeperSweeperRobot(2, 2, North, 0);
     karel.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel2 = new NewAndImprovedBeeperSweeperRobot(4, 7, North, 0);
     karel2.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel3 = new NewAndImprovedBeeperSweeperRobot(2, 13, North, 0);
     karel3.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel4 = new NewAndImprovedBeeperSweeperRobot(5, 7, East, 0);
     karel4.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel5 = new NewAndImprovedBeeperSweeperRobot(9, 15, North, 0);
     karel5.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel6 = new NewAndImprovedBeeperSweeperRobot(15, 20, East, 0);
     karel6.taskMainDriver2();
     NewAndImprovedBeeperSweeperRobot karel7 = new NewAndImprovedBeeperSweeperRobot(19, 2, North, 0);
     karel7.taskMainDriver2();
    } 

    static {
        World.reset(); 
        World.readWorld("manyRooms.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}