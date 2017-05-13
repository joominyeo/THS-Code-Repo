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
        GleaningRobot karel = new GleaningRobot(3, 2, North, 0);
        karel.task();

        GleaningRobot anotherKarel = new GleaningRobot(3, 7, North, 0);
        anotherKarel.task();
    } 

    static {
        World.reset(); 
        World.readWorld("roomOne.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}