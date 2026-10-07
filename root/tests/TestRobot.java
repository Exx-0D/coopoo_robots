import root.robots.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class TestRobot {

    static Robot tRobot1;
    static Robot tRobot2;
    static Robot tRobot3;

    @BeforeAll 
    static void init() {
        tRobot1 = new Robot("test", 0.0, 0, 0);
        tRobot2 = new Robot("test", 0.0, 0, 0);
        tRobot3 = new Robot("goodName", 0.0, 0, 0);
    }
    
    @Test
    public void verifName1() {
        assertEquals("Anonymous1", tRobot1.getName());
        assertEquals("Anonymous2", tRobot2.getName());
    }

    @Test
    public void verifName2() {
        assertEquals("goodName", tRobot3.getName());
    }
}