// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}

	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int startRow = grid.length;
		int endRow = -1;
		int startCol = grid.length;
		int endCol = -1;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == ch) {
					if (i < startRow) startRow = i;
					if (i > endRow) endRow = i;
					if (i < startCol) startCol = j;
					if (i > endCol) endCol = j;
				}
			}
		}
		if (endRow = -1) return 0;
		return (endRow - startRow + 1) * (endCol - startCol + 1); // YOUR CODE HERE
	}

	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		return 0; // YOUR CODE HERE
	}

}
