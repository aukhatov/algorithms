package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class BattleShipTest {

    @Test
    public void amazonTest1() {
        BattleShip battleShip = new BattleShip();
        assertEquals("1,1",  battleShip.solution(4, "1B 2C, 2D 4D", "2B 2D 3D 4D 4A"));
    }

    @Test
    public void amazonTest2() {
        BattleShip battleShip = new BattleShip();
        assertEquals("0,1", battleShip.solution(3, "1A 1B, 2C 2C", "1B"));
    }

    @Test
    public void amazonTest3() {
        BattleShip battleShip = new BattleShip();
        assertEquals("1,0", battleShip.solution(3, "1A 2A, 12A 12A", "12A"));
    }
}