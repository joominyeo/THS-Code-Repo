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
        BeeperSweeperRobot karel1 = new BeeperSweeperRobot(2, 2, East, 0);
        karel1.task();
        BeeperSweeperRobot karell2 = new BeeperSweeperRobot(6, 9, East, 0);
        karell2.task();
        BeeperSweeperRobot karell3 = new BeeperSweeperRobot(2, 18, East, 0);
        karell3.task();
        BeeperSweeperRobot karell4 = new BeeperSweeperRobot(12, 2, East, 0);
        karell4.task();
        BeeperSweeperRobot karell5 = new BeeperSweeperRobot(13, 10, East, 0);
        karell5.task();
        BeeperSweeperRobot karell6 = new BeeperSweeperRobot(14, 16, South, 0);
        karell6.task();
        BeeperSweeperRobot karell7 = new BeeperSweeperRobot(19, 2, East, 0);
        karell7.task();
        BeeperSweeperRobot karell8 = new BeeperSweeperRobot(24, 10, South, 0);
        karell8.task();
        BeeperSweeperRobot karell9 = new BeeperSweeperRobot(18, 20, East, 0);
        karell9.task();
    } 

    static {
        World.reset(); 
        World.readWorld("manyRooms.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}