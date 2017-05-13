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
        System.out.println("help");
        BinaryRobot karel = new BinaryRobot(1, 1, East, 0);
        karel.task();

        karel = new BinaryRobot(2, 1, East, 0);
        karel.task();
    } 

// Once again, ignore everything below this comment
    static {
        World.reset(); 
        World.readWorld("binaryWorld.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}