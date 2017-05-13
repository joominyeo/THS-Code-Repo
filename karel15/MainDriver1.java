/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;
import java.util.*;

public class MainDriver1 implements Directions
{

   public static void main(String args[])  {
      TreasureHunterBot karel_0 = new TreasureHunterBot(2, 9, East, 3);
      karel_0.pickAllBeepers();
      karel_0.moveForward(1);
      karel_0.putAllBeepers();
      karel_0.moveForward(1);

      TreasureHunterBot karel_1 = new TreasureHunterBot(1, 1, East, 0);
      karel_1.moveToWallOnLeftAndWallOnRight();

      TreasureHunterBot karel_2 = new TreasureHunterBot(3, 1, East, 0);
      karel_2.moveToWallOnLeftOrWallOnRight();

      TreasureHunterBot karel_2a = new TreasureHunterBot(5, 5, West, 0);
      karel_2a.moveToBeeper();

      Robot dummyBot = new Robot(8, 2, North, 0);
      TreasureHunterBot karel_3 = new TreasureHunterBot(8, 8, West, 0);
      karel_3.moveToRobot();
      karel_3.move();

      TreasureHunterBot karel_4 = new TreasureHunterBot(7, 8, West, 0);
      karel_4.moveToWall();

      TreasureHunterBot karel_5 = new TreasureHunterBot(4, 1, East, 0);
      karel_5.moveToWallOnLeft();

      TreasureHunterBot karel_6 = new TreasureHunterBot(4, 1, East, 0);
      karel_6.moveToWallOnRight();
   }

    static {
        World.reset();
        World.readWorld("treasureMapTest.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(5);  
         World.showSpeedControl(true);
         World.setVisible(true);
    }
}