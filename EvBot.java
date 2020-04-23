package myBots;
import robocode.*;


public class EvBot extends Robot {

    public void run() {

        while (true) {

            ahead(100);

            turnGunRight(360);

            back(150); 

            turnGunRight(360);

        }

    }


    public void onScannedRobot(ScannedRobotEvent e) {

        fire(1);

    }

}