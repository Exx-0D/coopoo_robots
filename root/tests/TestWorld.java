import root.robots.*;
import root.worlds.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestWorld {

    static World tworld1;
    static World tworld2;
    static World tworld3;
    static World tworld4;
    Robot tRobot1;
    Robot tRobot2;

    @BeforeAll 
    static void initWorld() {
        tworld1 = new World(-1);
        tworld2 = new World(0);
        tworld3 = new World(2);
        tworld4 = new World(8);
    }

    @BeforeEach 
    void initRobot() {
        tRobot1 = new Robot("robot1", 0.0, 0, 8);
        tRobot2 = new Robot("robot2", 0.0, 8, 8);
    }
    
    @Test 
    public void verifLength() {
        assertTrue(tworld1.getMax() >= 0);
        assertTrue(tworld2.getMax() >= 0); 
        assertEquals(2, tworld3.getMax());
    }

    @Test 
    public void verifInWorld() {
        assertTrue(tworld3.inWorld(0, 0));
        assertFalse(tworld3.inWorld(-2, 0));
        assertFalse(tworld3.inWorld(0, -2));
        assertFalse(tworld3.inWorld(-2, -2));
        assertTrue(tworld2.inWorld(0, 0));
    }

    @Test 
    public void verifMoveInWorld() {
        tworld4.setWorldRobot(tRobot1);
        tworld4.moveRobot();
        assertTrue(tworld4.inWorld(tworld4.getWorldRobot().getXPosition(), tworld4.getWorldRobot().getYPosition()));
        tworld4.setWorldRobot(tRobot2);
        tworld4.moveRobot();
        assertTrue(tworld4.inWorld(tworld4.getWorldRobot().getXPosition(), tworld4.getWorldRobot().getYPosition()));
    }

    @Test 
    public void verifMoveRobot() {
        tworld4.setWorldRobot(tRobot1);
        int initXPosition = tworld4.getWorldRobot().getXPosition();
        int initYPosition = tworld4.getWorldRobot().getYPosition();
        tworld4.moveRobot();
        assertEquals(initXPosition + 1, tworld4.getWorldRobot().getXPosition());
        assertEquals(initYPosition - 1, tworld4.getWorldRobot().getYPosition());
    }
}
