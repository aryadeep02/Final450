package matrixSolutions;
import java.util.*;

public class spiralTraversal {
	public static void main(String [] args) {
		/*
		 * 📌 Spiral Traversal of Matrix
		 *
		 * 👉 Approach:
		 * - Use 4 boundaries: top, bottom, left, right
		 * - Traverse in layers: 
		 *   1) left → right (top row)
		 *   2) top → bottom (right col)
		 *   3) right → left (bottom row) if valid
		 *   4) bottom → top (left col) if valid
		 * - Move boundaries inward after each loop
		 *
		 * ⏳ Time Complexity: O(m*n)  -> each element visited once
		 * 📦 Space Complexity: O(m*n) for result list (O(1) if just printing)
		 *
		 * 📝 Notes:
		 * - Always check conditions (top<bottom, left<right) to avoid duplicates
		 * - Easy way to remember: peel the matrix layer by layer
		 */

		int[][] matrix = {
		    {1, 2, 3, 8},
		    {4, 5, 6, 0},
		    {7, 8, 9, 3},
		    {3, 5, 2, 7}
		};

		ArrayList<Integer> result = new ArrayList<>();
		int row = matrix.length;
		int col = matrix[0].length;
		int left = 0, top = 0, right = col - 1, bottom = row - 1;

		while (left <= right && top <= bottom) {
			// left → right
			for (int i = left; i <= right; i++) result.add(matrix[top][i]);

			// top → bottom
			for (int i = top + 1; i <= bottom; i++) result.add(matrix[i][right]);

			// right → left
			if (top < bottom) {
				for (int i = right - 1; i >= left; i--) result.add(matrix[bottom][i]);
			}

			// bottom → top
			if (left < right) {
				for (int i = bottom - 1; i > top; i--) result.add(matrix[i][left]);
			}

			left++;
			right--;
			top++;
			bottom--;
		}

		System.out.println(result);
	}
}
