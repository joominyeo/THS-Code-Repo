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
        ImprovedBeeperSweeperRobot karel = new ImprovedBeeperSweeperRobot(2, 3, East, 0);

        karel.task();
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