package root.robots;

import root.worlds.*;

public class RobotT4 extends Robot {
    private final String creator = "Tom";

    public RobotT4 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world, int p_iPV) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world, p_iPV);
    }

    public String getCreator() {
        return this.creator;
    }

    public void direction(int dx) {
        while (this.world.isFree(this.xPosition + dx, this.yPosition)) {
            this.xPosition += dx;
        }   
    }

    public void move() {
        if (this.world.isFree(this.xPosition - 1, this.yPosition)) {
            direction(-1);
        }
        else {
            direction(1);
        }
    }
}
