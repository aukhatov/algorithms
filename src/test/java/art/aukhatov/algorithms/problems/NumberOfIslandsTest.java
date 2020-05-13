package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

	@Test
	public void shouldFoundThreeIslands() {
		int[][] map = new int[][]{
				{1, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0},
		};

		assertEquals(3, NumberOfIslands.count(map));
	}

	@Test
	public void shouldFoundOneIsland() {
		int[][] map = new int[][]{
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
		};

		assertEquals(1, NumberOfIslands.count(map));
	}

	@Test
	public void noOneIslands() {
		int[][] map = new int[][]{
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
		};

		assertEquals(0, NumberOfIslands.count(map));
	}

	@Test
	public void oneCornerIsland() {
		int[][] map = new int[][]{
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1},
		};

		assertEquals(1, NumberOfIslands.count(map));
	}

	@Test
	public void fourCornerIslands() {
		int[][] map = new int[][]{
				{1, 0, 0, 0, 1},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 1},
		};

		assertEquals(4, NumberOfIslands.count(map));
	}
}