package root.robots;

import root.worlds.*;

public class Robot {
    protected final String name;
    protected  double version;
    protected int xPosition = -1;
    protected int yPosition = -1;
    protected final World world;
    protected static int COUNTER = 1;
    protected final int iPV;
    protected int PV;
    protected final Type rtype;
    protected final int pa;

    public Robot(String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world, int p_iPV, Type p_rtype, int p_pa) {
        if (p_name.length() < 5) { 
            this.name = "Anonymous" + String.valueOf(COUNTER++);
        }
        else {
            this.name = p_name;
        }
        this.iPV = p_iPV;
        this.PV = p_iPV;
        this.rtype = p_rtype;
        this.pa = p_pa;
        this.world = p_world;
        if(p_world.isFree(p_xPosition, p_yPosition)) {
            // Si la taille du nom est inférieur à 5, on met un nom par défaut
            this.version = p_version;
            this.xPosition = p_xPosition;
            this.yPosition = p_yPosition;
            this.world.setWorldRobot(this);
        }
    }

    public String getName() {
        return this.name;
    }

    public double getVersion() {
        return this.version;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public World getWorld() {
        return this.world;
    }

    public int getIPV() {
        return this.iPV;
    }

    public int getPV() {
        return this.PV;
    }

    public void addPV(int p_quantity) {
        this.PV += p_quantity;
    }

    public void delPV(int p_quantity) {
        this.PV -= p_quantity;
        if (this.PV <= 0) {
            this.world.delRobot(this);
        }
    }

    public void move() {
        if (this.world.isFree(this.xPosition + 1, this.yPosition - 1)) {
            this.xPosition++;
            this.yPosition--;
        }
    }

    public String toString() {
        return "Robot " + this.name + " at position (" + this.xPosition + ", " + this.yPosition + ") with version " + this.version + " and life " + this.PV + "/" + this.iPV;
    }
}
