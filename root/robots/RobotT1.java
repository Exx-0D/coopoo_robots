package root.robots;

import root.worlds.*;

public class RobotT1 extends Robot {
    private final String creator = "Théo";

    public RobotT1 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world, int p_iPV) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world, p_iPV);
    }

    public String getCreator() {
        return this.creator;
    }

    public void direction(int dx, int dy) {
        while (this.world.isFree(this.xPosition + dx, this.yPosition + dy)) {
            this.xPosition += dx;
            this.yPosition += dy;
        }   
    }

    public void move() {
        if (this.world.isFree(this.xPosition + 1, this.yPosition - 1)) {
            direction(1, -1);
        }
        else {
            direction(-1, 1);
        }
    }
}
