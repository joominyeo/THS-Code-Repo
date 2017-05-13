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
        GeneralRobot karel = new GeneralRobot(1, 1, East, infinity, 2);
        karel.task();  // 5

        karel = new GeneralRobot(2, 1, East, infinity, 5);
        karel.task();  // 30

        karel = new GeneralRobot(3, 1, East, infinity, 8);
        karel.task();  // 1

        karel = new GeneralRobot(4, 1, East, infinity, 8);
        karel.task();  // 0

        karel = new GeneralRobot(5, 1, East, infinity, 10);
        karel.task();  // 91

        karel = new GeneralRobot(6, 1, East, infinity, 16);
        karel.task(); // 752

        karel = new GeneralRobot(7, 1, East, infinity, 16);
        karel.task();  // 193
    } 

// Once again, ignore everything below this comment
    static {
        World.reset(); 
        World.readWorld("GeneralWorld.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}