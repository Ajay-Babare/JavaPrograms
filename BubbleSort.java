//Approach : Bubble Sort
//time complexity : O(n^2)
//space complexity : O(1)

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
							
		for(int i=0;i<arr.length;i++) {
			
			boolean swapped = false;
			
			// for every iteration, we get the biggest element in the end of the array
			for(int j=0; j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
					swapped=true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//array definition
		int arr[] = {2,1,5,4,3};
		
		System.out.println("Before Sorting: ");
		System.out.println(Arrays.toString(arr));
		
		//funnction calling
		bubbleSort(arr);
		
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(arr));

	}

}
