package root.robots;

import root.worlds.*;

public class RobotT6 extends Robot {
    private final String creator = "Malak";

    public RobotT6 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world);
    }

    public String getCreator() {
        return this.creator;
    }

    public void move() {
        while (this.world.isFree(this.xPosition, this.yPosition - 1)) {
            this.yPosition--;
        } 
    }
}
