package root.worlds;
import root.robots.*;

public class World {
    private final int min = 0;
    private final int max;
    private Robot worldRobot;

    public World(int p_taille) {
        if (p_taille < 0) { // Si le monde ne peut exister, on créer un monde 1x1 par défaut
            p_taille = 0;
        }
        this.max = p_taille;
    }

    public void setWorldRobot (Robot p_worldRobot) {
        this.worldRobot = p_worldRobot; // Attention au cas où le robot n'est déjà pas dans le monde
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public Robot getWorldRobot() {
        return worldRobot;
    }

    public Boolean inWorld(int p_xPosition, int p_yPosition) {
        if (p_xPosition < this.min || p_xPosition > this.max) {
            return false;
        }
        if (p_yPosition < this.min || p_yPosition > this.max) {
            return false;
        }
        return true;
    }
}