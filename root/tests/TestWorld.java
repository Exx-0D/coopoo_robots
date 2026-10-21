package root.tests;

import root.robots.RobotT1;
import root.worlds.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

/**
 * TestWorld
 */
public class TestWorld {

    static World tworld1;
    static World tworld2;
    static World tworld3;
    static World tworld4;
    static RobotT1 trobot1;

    @BeforeAll 
    static void initWorld() {
        tworld1 = new World(-1);
        tworld2 = new World(0);
        tworld3 = new World(2);
        tworld4 = new World(8);
        trobot1 =new RobotT1("test", 0.0, 1, 1, tworld3, 100, Type.MAGIC, 9);
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
    public void getRobotAt(){
    assertEquals(trobot1, tworld3.getRobotAt(trobot1.getXPosition(), trobot1.getYPosition()));
    }

}

