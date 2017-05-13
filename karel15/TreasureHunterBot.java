import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class TreasureHunterBot extends FunctionRobot_3
{
    public TreasureHunterBot(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }
    
//  This methods has the Robot collect all Beepers on current corner!
    public void pickAllBeepers()
    {
        while (nextToABeeper())
        {
            pickBeeper();
        }
    }
    
//  This method has the Robot put all Beepers from its Beeper Bag on the current corner!
    public void putAllBeepers()
    {
        while (anyBeepersInBeeperBag())
      {
            putBeeper();
        }
    }

//  This method has the Robot move forward num corners!
    public void moveForward(int num)
    {
        for (int x=1; x<= num; x++)
        {
            move();
        }
    }

//  This method has the Robot move forward until the Robot is next to a Beeper!
    public void moveToBeeper()
    {
        while (!nextToABeeper())
        {
            move();
        }
    }

//  This method has the Robot move forward until the Robot is next to another Robot!
    public void moveToRobot()
    {
        while (!nextToARobot())
        {
            move();
        }
    }

//  This method has the Robot move forward until the Robot is facing a wall
    public void moveToWall()
    {
        while (frontIsClear())
        {
            move();
        }
    }

//  This method has the Robot move forward until the Robot has a wall on the left!
    public void moveToWallOnLeft()
    {
        while (!wallOnLeft())
        {
            move();
        }
    }
    
//  This method has the Robot move forward until the Robot has a wall on the right!
    public void moveToWallOnRight()
    {
        while (!wallOnRight())
        {
            turnLeft();
            move();
        }
    }

//  This method has the Robot move forward
//           until the Robot has a wall on both the right and Left!
    public void moveToWallOnLeftAndWallOnRight()
    {
        while (!(wallOnLeft() && wallOnRight()))
        {
            move();
        }
    }

//  This method has the Robot move forward
//           until the Robot has a wall on either the right or Left!
    public void moveToWallOnLeftOrWallOnRight()
    {
        while (!(wallOnLeft() || wallOnRight()))
        {
            move();
        }
    }

//  See handout for instructions
    public void findSecretTreasure()
    {
        moveToWallOnLeftAndWallOnRight();
        pickAllBeepers();
        moveForward(2);
        faceNorth();
        moveForward(7);
        faceWest();
        pickAllBeepers();
        moveToWall();
        faceSouth();
        moveToBeeper();
        
        pickAllBeepers();
        moveToBeeper();
        pickAllBeepers();
        faceEast();
        moveToWallOnLeft();
        turnAround();
        moveToRobot();
        faceNorth();
        moveToWallOnLeft();
        moveToWallOnRight();
        
        moveForward(1);
        faceEast();
        moveToWallOnLeftOrWallOnRight();
        moveForward(1);
        moveToWallOnLeftOrWallOnRight();
        moveForward(1);
        moveToWallOnLeftOrWallOnRight();
        moveToWall();
        faceSouth();
        moveToBeeper();
        
        pickAllBeepers();
        faceWest();
        moveForward(13);
        putAllBeepers();
        turnAround();
        move();
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
/*

 *          Code the following in findSecretTreasure(); :

1.  Move till there is a wall on the Robots left and a wall on the robots right at the same time!
2.  Pick up all the Beepers on this corner.
3.  Use the moveForward(int numMoves) to move forward two corners.
4.  Face north.
5.  Use the moveForward(int numMoves) to move forward seven corners.
6.  Face west.
7.  Pick up all the Beepers on this corner.
8.  Move forward until a wall is directly (next corner) in front of the Robot.
9.  Face south.
10. Move forward until next to a Beeper.

11. Pick up all the Beepers on this corner.
12. Move forward until next to a Beeper.
13. Pick up all the Beepers on this corner.
14. Face east.
15. Move till there is a wall on the Robots left.
16. Turn around.
17. Move forward until next to another Robot.
18. Face north.
19. Move till there is a wall on the Robots left.
20. Move till there is a wall on the Robots right.

21. Use the moveForward(int numMoves) to move forward once.
22. Face east.
23. Move till there is a wall on either the Robots left and/or a wall on the robots right.
24. Move forward once.
25. Move till there is a wall on either the Robots left and/or a wall on the robots right.
26. Move forward once.
27. Move till there is a wall on either the Robots left and/or a wall on the robots right.
28. Move forward until a wall is directly (next corner) in front of the Robot.
29. Face south.
30. Move forward until next to a Beeper.

31. Pick up all the Beepers on this corner.
32. Face west.
33. Use the moveForward(int numMoves) to move forward 13 times.
34. Put all the Beepers from Beeper Bag on this corner. //  note:  There should be 21 Beepers on corner 1, 1.
35. Turn around.
36. Move forward once.  //  The Robot should terminate at street 1 and avenue 2.
*/

}