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

        Robot signPost = new Robot(4, 2, South, 0);

        TreasureHunterBot karel = new TreasureHunterBot(1, 1, East, 0);
        karel.findSecretTreasure();
   } 

    static {
        World.reset(); 
        World.readWorld("treasureMap.kwld"); 
//        World.setBeeperColor(Color.magenta);
//        World.setStreetColor(Color.blue);
//        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}