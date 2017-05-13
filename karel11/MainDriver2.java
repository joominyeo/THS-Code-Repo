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
        TrackerRobot karel1 = new TrackerRobot(1, 1, East, 0);
        karel1.race41Steps(41);
        
    } 

    static {
        World.reset(); 
        World.readWorld("Orienteering.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}