package matrixSolutions;
import java.util.*;
public class spiralTraversal {
	public static void main(String [] args) {
		int[][] matrix = {
			    {1, 2, 3, 8},
			    {4, 5, 6, 0},
			    {7, 8, 9, 3},
			    {3, 5, 2, 7}
		
			};
		ArrayList<Integer> result=new ArrayList<>();
		int row=matrix.length;
		int col=matrix[0].length;
		int left=0;
		int top=0;
		int right=col-1;
		int bottom=row-1;
		while(left<=right && top<=bottom ){
			for(int i=left;i<=right;i++) {
				result.add(matrix[top][i]);
			}
			
			for(int i=top+1;i<=bottom;i++) {
				result.add(matrix[i][right]);
			}
			if(top<bottom) {
				for(int i=right-1;i>=left;i--) {
					result.add(matrix[bottom][i]);
				}
			}
			if(left<right) {
				for(int i=bottom-1;i>top;i--) {
					result.add(matrix[i][left]);
				}
			}
			
			left++;
			right--;
			top++;
			bottom--;
		
		}
		System.out.println(result);
		
	}
	

}
