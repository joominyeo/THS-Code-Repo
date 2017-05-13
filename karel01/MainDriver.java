/**
   @Author:Yeo
      Date:2013-02-22
   Teacher:Mr.Grack
    Period:3
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver implements Directions
{
    public static void main(String args[])  {
        LeftSpinningRobot firstKarel = new LeftSpinningRobot(3, 3, North, 0, Color.yellow);
        RightSpinningRobot secondKarel = new RightSpinningRobot(3, 4, North, 0, Color.blue);
        LeftSpinningRobot thirdKarel = new LeftSpinningRobot(3, 5, North, 0, Color.yellow);
        RightSpinningRobot fourthKarel = new RightSpinningRobot(3, 6, North, 0, Color.blue);

        GuardRobot firstGuard = new GuardRobot(2, 2, East, 0, Color.pink.darker());
        GuardRobot secondGuard = new GuardRobot(4, 7, West, 0, Color.pink.darker());

        firstGuard.task();
        firstKarel.task();
        secondKarel.task();
        thirdKarel.task();
        fourthKarel.task();
        secondGuard.task();
    } 

    static {
        World.reset(); 
        World.readWorld("Lab01.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(15);  
        World.setVisible(true);
        System.out.println('\f');

    }
}