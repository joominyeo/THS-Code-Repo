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
        ImprovedBeeperSweeperRobot karel = new ImprovedBeeperSweeperRobot(2, 3, East, 0);
        ImprovedBeeperSweeperRobot karel2 = new ImprovedBeeperSweeperRobot(10, 6, East, 0);
        ImprovedBeeperSweeperRobot karel3 = new ImprovedBeeperSweeperRobot(13, 1, East, 0);
        ImprovedBeeperSweeperRobot karel4 = new ImprovedBeeperSweeperRobot(19, 6, East, 0);
        ImprovedBeeperSweeperRobot karel5 = new ImprovedBeeperSweeperRobot(3, 13, East, 0);
        ImprovedBeeperSweeperRobot karel6 = new ImprovedBeeperSweeperRobot(1, 20, East, 0);
        ImprovedBeeperSweeperRobot karel7 = new ImprovedBeeperSweeperRobot(13, 11, South, 0);
        ImprovedBeeperSweeperRobot karel8 = new ImprovedBeeperSweeperRobot(13, 19, South, 0);
        ImprovedBeeperSweeperRobot karel9 = new ImprovedBeeperSweeperRobot(14, 11, East, 0);
        ImprovedBeeperSweeperRobot karel10 = new ImprovedBeeperSweeperRobot(14, 16, East, 0);
        
        karel.task();
        karel2.task();
        karel3.task();
        karel4.task();
        karel5.task();
        karel6.task();
        karel7.task();
        karel8.task();
        karel9.task();
        karel10.task();
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