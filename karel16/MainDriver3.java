/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver3 implements Directions
{
    public static void main(String args[])  {
        GleaningGoodSamaritanRobot karel1 = new GleaningGoodSamaritanRobot(24, 4, West, 0);
        GleaningGoodSamaritanRobot karel2 = new GleaningGoodSamaritanRobot(4, 5, North, 0);
        GleaningGoodSamaritanRobot karel3 = new GleaningGoodSamaritanRobot(24, 8, East, 0);
        GleaningGoodSamaritanRobot karel4 = new GleaningGoodSamaritanRobot(2, 8, East, 0);
        GleaningGoodSamaritanRobot karel5 = new GleaningGoodSamaritanRobot(12, 10, South, 0);
        GleaningGoodSamaritanRobot karel6 = new GleaningGoodSamaritanRobot(15, 12, West, 0);
        GleaningGoodSamaritanRobot karel7 = new GleaningGoodSamaritanRobot(9, 12, South, 0);
        GleaningGoodSamaritanRobot karel8 = new GleaningGoodSamaritanRobot(5, 12, East, 0);
        GleaningGoodSamaritanRobot karel9 = new GleaningGoodSamaritanRobot(23, 23, West, 0);
        GleaningGoodSamaritanRobot karel10 = new GleaningGoodSamaritanRobot(22, 23, West, 0);
        karel1.task();
        karel2.task();
        karel3.task();
        karel4.task();
        karel5.task();
        karel6.task();
        karel7.task();
        karel8.task();
        karel9.task();
        karel10.task();
    } 

    static {
        World.reset(); 
        World.readWorld("roomThree.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker().darker());
        World.setDelay(1);  
        World.setVisible(true);
        MinerRobot miner1 = new MinerRobot(4, 2, North, 0);
        miner1 = new MinerRobot(24, 23, North, 0);
        miner1 = new MinerRobot(8, 18, North, 0);
        miner1 = new MinerRobot(24, 11, West, 0);
        miner1 = new MinerRobot(2, 8, West, 0);
        miner1 = new MinerRobot(24, 4, South, 0);
        miner1 = new MinerRobot(7, 15, South, 0);
        miner1 = new MinerRobot(21, 12, South, 0);
        miner1 = new MinerRobot(16, 6, East, 0);
        miner1 = new MinerRobot(12, 5, East, 0);
    }
}