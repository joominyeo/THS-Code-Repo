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
        NewAndImprovedBeeperSweeperRobot karel = new NewAndImprovedBeeperSweeperRobot(2, 3, North, 0);

        karel.taskMainDriver1();
    } 

    static {
        World.reset(); 
        World.readWorld("singleRoom.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}