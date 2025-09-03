package searchingAndSorting;

import java.util.Arrays;

public class firstAndLastPosition {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,3,4,3,9};
		int target=3;
		int[] res=findingPosition(arr,target);
		System.out.println(Arrays.toString(res));
		
		
	}
	static int[] findingPosition(int[] arr,int target) {
		int [] result=new int[2];
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				if(first==-1) {
					first=i;
				}
				result[0]=first;
				last=i;
			}
			result[1]=last;
		}
		return result;
		
	}
	
	

}
