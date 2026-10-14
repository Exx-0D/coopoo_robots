package root.tests;

import root.robots.*;
import root.worlds.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestRobot {

    static World tWorld1;
    static World tWorld2;
    static World tWorld3;
    static World tWorld4;
    static World tWorld5;
    static World tWorld6;
    static World tWorld7;
    static Robot tRobot1;
    static Robot tRobot2;
    static Robot tRobot3;
    static Robot tRobot4;
    static Robot tRobot6;
    static Robot tRobot8;
    static RobotT3 tRobot7;
    static RobotT1 tRobot5;

    @BeforeAll 
    static void init() {
        tWorld1 = new World(8);
        tWorld2 = new World(8);
        tWorld3 = new World(8);
        tWorld4 = new World(8);
        tWorld5 = new World(8);
        tWorld6 = new World(8);
        tWorld7 = new World(8);
        tRobot1 = new Robot("test", 0.0, 0, 0, tWorld1, 100, Type.MAGIC, 9);
        tRobot2 = new Robot("test", 0.0, 2, 2, tWorld2, 100, Type.MAGIC, 9);
        tRobot3 = new Robot("goodName", 0.0, 8, 8, tWorld3, 100, Type.MAGIC, 9);
        tRobot6 = new Robot("goodName", 0.0, 4, 4, tWorld3, 100, Type.MAGIC, 9);
        tRobot7 = new RobotT3("goodName", 0.0, 0, 4, tWorld3, 100, Type.MAGIC, 9);
        tRobot8 = new RobotT3("goodName", 0.0, 0, 4, tWorld3, 100, Type.MAGIC, 9);
        tRobot5 = new RobotT1("test", 0.0, 0, 8, tWorld5, 100, Type.MAGIC, 9);
        tRobot3.move();
        tRobot5.move();     
        tRobot7.move();   
    }

    @BeforeEach 
    void reinit() {
        tRobot4 = new Robot("test", 0.0, 2, 2, tWorld6, 100, Type.MAGIC, 9);
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

    @Test 
    public void verifInitInWorld() {
        assertTrue(tRobot2.getWorld().inWorld(tRobot2.getXPosition(), tRobot2.getYPosition()));
        assertEquals(2, tRobot2.getXPosition());
        assertEquals(2, tRobot2.getYPosition());
    }

    @Test 
    public void verifMoveInWorld() {
        assertEquals(8, tRobot3.getXPosition());
        assertEquals(8, tRobot3.getYPosition());
    }

    @Test 
    public void verifMove() {
        tRobot4.move();
        assertEquals(3, tRobot4.getXPosition());
        assertEquals(1, tRobot4.getYPosition());
    }

    @Test 
    public void verifSpecificMove() {
        assertEquals(8, tRobot5.getXPosition());
        assertEquals(0, tRobot5.getYPosition());
    }

    // Tester l'ajout d'un robot sur une case prise
    @Test 
    public void verifInitColision() {
        assertEquals(-1, tRobot8.getXPosition());
    }

    //Tester la colision entre robots
    @Test 
    public void verifColision() {
        assertEquals(4, tRobot7.getYPosition());
        assertEquals(3, tRobot7.getXPosition());
    }
}