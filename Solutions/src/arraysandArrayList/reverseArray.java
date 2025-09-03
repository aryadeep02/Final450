package arraysandArrayList;
import java.util.*;

public class reverseArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array Before Reversal: " + Arrays.toString(arr));

        // First solution (extra array)
        int[] reversed1 = firstSolution(arr);
        System.out.println("Array after reversal (FirstSolution): " + Arrays.toString(reversed1));

        // Second solution (in-place using two pointers)
        int[] reversed2 = secondSolution(arr.clone()); // clone to preserve original
        System.out.println("Array after reversal (SecondSolution): " + Arrays.toString(reversed2));

        
    }

    // ✅ First solution: extra array
    static int[] firstSolution(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - i - 1];
        }
        return rev;
    }

    // ✅ Second solution: in-place reversal (two-pointer approach)
    static int[] secondSolution(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

   
	

}

