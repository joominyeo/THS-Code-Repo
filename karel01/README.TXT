Karel01

This is your next introduction into the world of Karel.

The task:
Copy the folder Karel01 to you work area.  Open in BlueJ and execute the program.  A world should appear which contains a rectangle containing four Robots and two additional Robots outside the rectangle.  Three different Robots will be coded to perform a different task.  Unlike Alice, in Karel we will not have more than one Object (Robot) moving at the same time.  You should be able to look at the MainDriver class and determine the order that the Robots will perform their task.  For each reference (Robot name) listed below, indicate if the Robot will perform its task first, second, third, etc.

______	firstKarel
______	secondKarel
______	thirdKarel
______	fourthKarel
______	firstGuard
______	secondGuard

Your assignment in this program is to implement (remember what implement means?) the task method in each class (file) LeftSpinningRobot, RightSpinningRobot and GuardRobot.
You should implement the task method for the LeftSpinningRobot so that the LeftSpinningRobot will make three complete revolutions (How many turnLeft’s are required?)  Remember to use step-wise refinement when implementing your solution that you have preplanned. No method should more than 7 commands.
You should implement the task method for the RightSpinningRobot so that the RightSpinningRobot will make one complete revolutions by invoking turnRight() four times.  (Do we expect the Robot to turnRight or turnLeft?  How many times do we expect the Robot to turnLeft?)  Remember to use step-wise refinement when implementing your solution that you have preplanned. No method should more than 7 commands.
You should implement the task method for the GuardRobot so that the GuardRobot will make two complete trips around the SpinningRobots in the rectangle.  (How many times will the Robot move forward and what should the Robot do when it is done moving forward?)  Remember to use step-wise refinement when implementing your solution that you have preplanned. No method should more than 7 commands.

When implementing each task, remember to practice writing some code and testing your solution.  Add a couple of instructions (move(), turnLeft(), etc.), save and execute (compile, right-click on MainDriver, ) and see what the Robot does.  Fix any errors (compile time or run time or intent) you encounter.  Once you Robot performed as anticipated, add a few more lines of code and check again.  Continue in this manner until the Robot has completed the desired task.  After completing one Robot, go on and start implementing the solution to another Robot.
