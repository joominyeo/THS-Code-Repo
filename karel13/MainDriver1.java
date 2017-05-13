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
        HanselAndGretelRobot karel_B1 = new HanselAndGretelRobot(11, 7, West, 0);
        karel_B1.followAllBreadCrumbs();
   } 

    static {
        World.reset(); 
        World.readWorld("breadCrumbs.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}