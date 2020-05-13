package art.aukhatov.algorithms.problems;

public class NumberOfIslands {

	private NumberOfIslands() {
	}

	public static int count(int[][] map) {
		int numOfIslands = 0;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1) {
					numOfIslands++;
					bfs(map, i, j);
				}
			}
		}

		return numOfIslands;
	}

	private static void bfs(int[][] map, int i, int j) {
		boolean rowBound = i < 0 || i >= map.length;
		boolean columnBound = j < 0 || j >= map[i].length;

		if (rowBound || columnBound || map[i][j] == 0) {
			return;
		}

		map[i][j] = 0;
		bfs(map, i + 1, j); // up
		bfs(map, i - 1, j); // down
		bfs(map, i, j - 1); // left
		bfs(map, i, j + 1); // right
	}
}
