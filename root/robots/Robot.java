package root.robots;

public class Robot {
    private final String name;
    private double version;
    private int xPosition;
    private int yPosition;
    private static int COUNTER = 1;

    public Robot(String p_name, double p_version, int p_xPosition, int p_yPosition) {
        // Si la taille du nom est inférieur à 5, on met un nom par défaut
        if (p_name.length() < 5) { 
            this.name = "Anonymous" + String.valueOf(COUNTER++);
        }
        else {
            this.name = p_name;
        }
        this.version = p_version;
        this.xPosition = p_xPosition;
        this.yPosition = p_yPosition;
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

    public void move(int p_xPosition, int p_yPosition) {
        this.xPosition = p_xPosition;
        this.yPosition = p_yPosition;
    }
}