package matrixSolutions;

public class SearchElement {
	public static void main(String[] args) {
		/*
		 * 📌 Search Element in a 2D Matrix
		 *
		 * 👉 Approach:
		 * - Use two nested loops to scan each element
		 * - If target found → print "True" and stop
		 * - Else → after full search, print "False"
		 *
		 * ⏳ Time Complexity: O(m*n)  -> checks all elements in worst case
		 * 📦 Space Complexity: O(1)   -> no extra space used
		 *
		 * 📝 Notes:
		 * - Brute force method, simple and works for any matrix
		 * - Can be optimized if matrix is sorted (binary search / staircase search)
		 */

		int[][] arr = {
			{10, 22, 41, 50, 16},
			{20, 45, 13, 14, 19},
			{23, 42, 21, 44, 56}
		};

		int target = 20;
		int row = arr.length;
		int col = arr[0].length;
		boolean found = false;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == target) {
					System.out.println("True");
					found = true;
					break; // stop inner loop
				}
			}
			if (found) break; // stop outer loop
		}

		if (!found) {
			System.out.println("False");
		}
	}
}
