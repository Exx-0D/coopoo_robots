package root.special;

import root.robots.*;

class Trap extends Special {

    public Trap(String name, int xposition, int yposition) {
        super(name, xposition, yposition);
    }

    public String toString() {
        return "Trap " + this.getName() + " at position (" + this.getXPosition() + ", " + this.getYPosition() + ")";
    }


    public void trigger(Robot robot) {
        robot.delPV(robot.getIPV() / 2);
    }
}

