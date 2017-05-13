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
        GleaningGoodSamaritanRobot karel1 = new GleaningGoodSamaritanRobot(3, 2, North, 0);
        karel1.task();

        GleaningGoodSamaritanRobot anotherKarel = new GleaningGoodSamaritanRobot(3, 7, North, 0);
        anotherKarel.task();
    } 

    static {
        World.reset(); 
        World.readWorld("roomTwo.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(3);  
        World.setVisible(true);
        MinerRobot miner1 = new MinerRobot(4, 2, North, 0);
        miner1 = new MinerRobot(5, 2, West, 0);
        miner1 = new MinerRobot(8, 2, North, 0);
        miner1 = new MinerRobot(6, 3, South, 0);
        miner1 = new MinerRobot(7, 9, South, 0);
        miner1 = new MinerRobot(3, 5, East, 0);
        miner1 = new MinerRobot(3, 7, South, 0);
        miner1 = new MinerRobot(4, 9, East, 0);
    }
}