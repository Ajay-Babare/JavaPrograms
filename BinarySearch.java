//time complexity O(log n)
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target) {
		int low=0, high=arr.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return 0;
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
		
		int result = binarySearch(arr,n);
		if(result==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element found at index "+result);
		}

	}

}
