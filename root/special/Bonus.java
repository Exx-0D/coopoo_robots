package root.special;

import root.robots.*;

class Bonus extends Special{
    private int bonusValue;


    public Bonus(String p_name, int p_xposition, int p_yposition, int p_bonusValue) {
        super(p_name, p_xposition, p_yposition);
        this.bonusValue = p_bonusValue;
    }


    public int getBonusValue() {
        return bonusValue;
    }
    public String toString() {
        return "Bonus " + this.getName() + " at position (" + this.getXPosition() + ", " + this.getYPosition() + ") with value " + this.bonusValue;
    }
    public void Heal(Robot robot) {
        robot.addPV(this.bonusValue);
    }
}

