package root.robots;

import root.worlds.*;

public class RobotT11 extends Robot {
    private final String creator = "Johana";

    public RobotT11 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world, int p_iPV, Type p_rtype, int p_pa) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world, p_iPV, p_rtype, p_pa);
    }

    public String getCreator() {
        return this.creator;
    }

    public void direction(int dy) {
        if (this.world.isFree(this.xPosition + 1, this.yPosition + dy)) {
            this.xPosition++;
            this.yPosition += dy;
        }   
    }

    public void move() {
        if (this.world.isFree(this.xPosition + 1, this.yPosition + 2)) {
            direction(2);
        }
        else {
            direction(-2);
        }
    }
}
