package root.robots;

import root.worlds.*;

public class Robot {
    private final String name;
    private double version;
    private int xPosition;
    private int yPosition;
    private final World world;
    private static int COUNTER = 1;

    public Robot(String p_name, double p_version, int p_xPosition, int p_yPosition, World p_world) {
        // Si la taille du nom est inférieur à 5, on met un nom par défaut
        if (p_name.length() < 5) { 
            this.name = "Anonymous" + String.valueOf(COUNTER++);
        }
        else {
            this.name = p_name;
        }
        this.version = p_version;
        this.world = p_world;
        this.world.setWorldRobot(this);
        // Si le robot est hors du monde
        if (this.world.inWorld(p_xPosition, p_yPosition)) {
            this.xPosition = p_xPosition;
            this.yPosition = p_yPosition;
        }
        else {
            this.xPosition = this.world.getMin();
            this.yPosition = this.world.getMin();
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

    public void move(int p_xPosition, int p_yPosition) {
        if (this.world.inWorld(this.xPosition + 1, this.yPosition - 1)) {
            this.xPosition++;
            this.yPosition--;
        }
    }
}