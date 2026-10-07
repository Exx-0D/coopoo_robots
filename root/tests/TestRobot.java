import root.robots.*;
import root.worlds.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class TestRobot {

    static World tWorld1;
    static World tWorld2;
    static World tWorld3;
    static Robot tRobot1;
    static Robot tRobot2;
    static Robot tRobot3;

    @BeforeAll 
    static void init() {
        tWorld1 = new World(8);
        tWorld2 = new World(8);
        tWorld3 = new World(8);
        tRobot1 = new Robot("test", 0.0, 0, 0, tWorld1);
        tRobot2 = new Robot("test", 0.0, 0, 0, tWorld2);
        tRobot3 = new Robot("goodName", 0.0, 0, 0, tWorld3);
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
        // Vérification de l'initiation dans le monde
    }

    @Test 
    public void verifMoveInWorld() {
        // Vérification des déplacement en dehors du monde
    }

    @Test 
    public void verifMove() {
        // Vérficiation des mouvements attendus
    }
}