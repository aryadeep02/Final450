package searchingAndSorting;
import java.util.*;
public class Q2FixedPoint {
	/*
     * 📌 Find values that are equal to their (1-based) index
     *
     * 👉 Approach:
     * - Loop through the list
     * - Check if nums.get(i) == i+1
     * - If yes, add to result list
     *
     * ⏳ Time Complexity: O(n)
     * 📦 Space Complexity: O(k) -> k = number of matches (O(1) extra space)
     *
     * 📝 Notes:
     * - Difference between List and Array in Java:
     *   1) Array -> fixed size, uses arr[i] for access, has .length
     *   2) List  -> dynamic size, uses get(i)/add(), has .size()
     *   3) Array is faster for raw storage, List is flexible for resizing
     */
	public static void main(String[] args) {
		int[] arr= {1,23,3,34,5,12,6};
		ArrayList<Integer> result=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				result.add(i+1);
			}
		}
		System.out.println(result);
		
	}

}
