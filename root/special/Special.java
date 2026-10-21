package root.special;

public class Special {
    protected String name;
    protected int xposition;
    protected int yposition;

    public Special(String p_name, int p_xposition, int p_yposition) {
        this.name = p_name;
        this.xposition = p_xposition;
        this.yposition = p_yposition;
    }

    public String getName() {
        return name;
    }
    public int getXPosition() {
        return xposition;
    }
    public int getYPosition() {
        return yposition;
    }
}
