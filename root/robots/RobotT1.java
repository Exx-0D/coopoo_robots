package root.robots;

import root.worlds.*;

public class RobotT1 extends Robot {
    private final String creator = "Théo";

    public RobotT1 (String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world) {
        super(p_name, p_version, p_xPosition, p_yPosition, p_world);
    }

    public String getCreator() {
        return this.creator;
    }

    public void move() {
        while (this.world.isFree(this.xPosition + 1, this.yPosition - 1)) {
            this.xPosition++;
            this.yPosition--;
        }   
    }
}
