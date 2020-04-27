package myBots;
import robocode.*;


public class EvBot extends AdvancedRobot {
	boolean forwardCheck;

	public void run() {
		setAhead(40000);
		while (true) {
			setAhead(40000);
			
			forwardCheck = true;
			setTurnRight(90);
				waitFor(new TurnCompleteCondition(this));
			setTurnLeft(90);
				waitFor(new TurnCompleteCondition(this));
			setTurnRight(90);
				waitFor(new TurnCompleteCondition(this));
		}
	}

	public void onHitWall(HitWallEvent e) {
		setTurnGunRight(360);
		reverseDirection();
		setTurnGunRight(360);
	}

	public void reverseDirection() {
		if (forwardCheck) {
			setBack(40000);
			forwardCheck = false;
		} 
		else{
			setAhead(40000);
			forwardCheck = true;
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(15);
	}


	public void onHitRobot(HitRobotEvent e) {
		if (e.isMyFault()) {
			reverseDirection();
		}
		setTurnGunRight(360);
	}
}