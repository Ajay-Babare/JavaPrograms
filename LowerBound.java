// Modification of Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

import java.util.Scanner;

public class LowerBound {
	
	public static int lowerBound(int[] arr, int target) {	
		int low = 0, high =  arr.length-1;
		int result = -1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==target) {
				result = mid;
				high = mid-1;
			}
			else if(arr[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//take the size of array
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		//declare the array
		int arr[]= new int[size];
		System.out.println("Enter Sorted Array Elements: ");
		
		//storing array elements
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be search: ");
		int n = sc.nextInt();
		
		int result = lowerBound(arr,n);
		if(result==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element found at index "+result);
		}

	}

}
