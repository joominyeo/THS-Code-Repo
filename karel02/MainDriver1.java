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
        HurdlerRobot firstKarel = new HurdlerRobot(1, 1, East, 0);
        WallClimberRobot secondKarel = new WallClimberRobot(4, 1, East, 0);
        UpAndUnderRobot thirdKarel = new UpAndUnderRobot(10, 1, East, 0);
        AnchorLegRobot fourthKarel = new AnchorLegRobot(13, 1, East, 0);

        fourthKarel.task();
        secondKarel.task();
        firstKarel.task();
        thirdKarel.task();
    } 

    static {
        World.reset(); 
        World.readWorld("testCourse.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}