package root.robots;

import root.worlds.*;

public class Robot {
    protected final String name;
    protected  double version;
    protected int xPosition;
    protected int yPosition;
    protected final World world;
    protected static int COUNTER = 1;

    public Robot(String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world) {
        if (p_name.length() < 5) { 
            this.name = "Anonymous" + String.valueOf(COUNTER++);
        }
        else {
            this.name = p_name;
        }
        this.world = p_world;
        if(p_world.isFree(p_xPosition, p_yPosition)) {
            // Si la taille du nom est inférieur à 5, on met un nom par défaut
            this.version = p_version;
            this.xPosition = this.world.getMin();
            this.yPosition = this.world.getMin();
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

    public void move() {
        if (this.world.isFree(this.xPosition + 1, this.yPosition - 1)) {
            this.xPosition++;
            this.yPosition--;
        }
    }
}