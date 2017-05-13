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
// add your code here

        HurdlerRobot firstKarel = new HurdlerRobot(1, 1, East, 0);
        WallClimberRobot secondKarel = new WallClimberRobot(1, 8, East, 0);
        UpAndUnderRobot thirdKarel = new UpAndUnderRobot(1, 14, East, 0);
        AnchorLegRobot fourthKarel = new AnchorLegRobot(1, 20, East, 0);


        firstKarel.task();
        secondKarel.task();
        thirdKarel.task();
        fourthKarel.task();
        fourthKarel.move();
    } 

    static {
        World.reset(); 
        World.readWorld("ObstacleCourse.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(15);  
        World.setVisible(true);
    }
}