package root.worlds;

import java.util.ArrayList;

import root.robots.*;

public class World {
    private final int min = 0;
    private final int max;
    private ArrayList<Robot> worldRobot = new ArrayList<>();

    public World(int p_taille) {
        if (p_taille < 0) { // Si le monde ne peut exister, on créer un monde 1x1 par défaut
            p_taille = 0;
        }
        this.max = p_taille;
    }

    public void setWorldRobot (Robot p_worldRobot) {
        this.worldRobot.add(p_worldRobot);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public ArrayList<Robot> getWorldRobot() {
        return worldRobot;
    }

    public Boolean inWorld(int p_xPosition, int p_yPosition) {
        if (p_xPosition < this.min || p_xPosition > this.max) {
            return false;
        }
        if (p_yPosition < this.min || p_yPosition > this.max) {
            return false;
        }
        return true;
    }

    public Boolean isRobot(int p_xPosition, int p_yPosition) {
        for (Robot robot: this.worldRobot) {
            if ((robot.getXPosition() == p_xPosition) && (robot.getYPosition() == p_yPosition)) {
                return true;
            }
        }
        return false;
    }

    public Boolean isFree(int p_xPosition, int p_yPosition) {
        return (inWorld(p_xPosition, p_yPosition) && !isRobot(p_xPosition, p_yPosition));
    }

    public void moveRobots() {
        for (Robot robot: this.worldRobot) {
            robot.move();
        }
    }
}