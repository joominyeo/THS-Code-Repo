/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver0 implements Directions
{
    public static void main(String args[])  {
        MinerRobot karel = new MinerRobot(8, 7, West, 0);
        karel.escape();

        MinerRobot anotherKarel = new MinerRobot(6, 4, East, 0);
        anotherKarel.escape();
    } 

    static {
        World.reset(); 
        World.readWorld("roomZero.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(5);  
        World.setVisible(true);
    }
}