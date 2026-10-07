package root.robots;

import root.worlds.*;

public class RobotT10 extends Robot {
    private final String creator = "Valentin";

    public RobotT10 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world);
    }

    public String getCreator() {
        return this.creator;
    }

    public void move() {
        if (this.world.inWorld(this.xPosition + 1, this.yPosition + 1)) {
            this.xPosition++;
            this.yPosition++;
        }    
    }
}
