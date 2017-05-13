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
        ComparingRobot_2 karel = new ComparingRobot_2(1, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be true");

        karel = new ComparingRobot_2(3, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be false");

        karel = new ComparingRobot_2(5, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be false");

        karel = new ComparingRobot_2(7, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be false");

        karel = new ComparingRobot_2(9, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be true");

        karel = new ComparingRobot_2(11, 1, East, 0);
        System.out.println("answer is " + karel.compareStreets() + " Should be true");
    } 

// Once again, ignore everything below this comment
    static {
        World.reset(); 
        World.readWorld("SampleWorld_2.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(2);  
        World.showSpeedControl(true);
        World.setVisible(true);
    }
}