package myBots;
import robocode.*;


public class EvBot extends AdvancedRobot {
	boolean movingForward;

	/**
	 * run: Crazy's main run function
	 */
	public void run() {
		
		while (true) {
			setAhead(40000);
			movingForward = true;
			setTurnRight(90);
			waitFor(new TurnCompleteCondition(this));
			setTurnLeft(180);
			waitFor(new TurnCompleteCondition(this));
			setTurnRight(180);
			waitFor(new TurnCompleteCondition(this));
		}
	}

	public void onHitWall(HitWallEvent e) {

		reverseDirection();
	}

	public void reverseDirection() {
		if (movingForward) {
			setBack(40000);
			movingForward = false;
		} else {
			setAhead(40000);
			movingForward = true;
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}


	public void onHitRobot(HitRobotEvent e) {
		if (e.isMyFault()) {
			reverseDirection();
		}
	}
}