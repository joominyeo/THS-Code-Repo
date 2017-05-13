/**
   @Author:
      Date:
   Teacher:
    Period:
  */

import kareltherobot.*;
import java.awt.Color;

public class MainDriver implements Directions
{
    public static void main(String args[])  {
        Karel00 karel = new Karel00(2, 2, East, 0);
        karel.task();
        Karel00 karel2 = new Karel00(6, 6, West, 1);
        karel2.task();

    } 

// Once again, ignore everything below this comment
    static {
        World.reset(); 
        World.readWorld("world00.kwld"); 
        World.setBeeperColor(Color.pink);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.blue.darker().darker().darker());
        World.setDelay(15);  
        World.setVisible(true);
    }
}