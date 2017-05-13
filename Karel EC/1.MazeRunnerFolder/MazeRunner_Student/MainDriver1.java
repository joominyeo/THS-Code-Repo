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
        MazeRunnerRobot karel = new MazeRunnerRobot(1, 1, East, 0);
        karel.task();
    } 

    static {
        World.reset(); 
        World.readWorld("maze.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}