
public class BinarySearchRecursion {

	public static int binarySearch(int[] arr, int low, int high, int x) {
		int result = -1;
		while(low <=high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] < x) {
				return binarySearch(arr, mid+1, high, x);
			}
			else {
				return binarySearch(arr, low, mid-1, x);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int low = 0;
		int high = arr.length-1;
		int x = 5;
		int result = binarySearch(arr, low,high, x);
		System.out.println("The array element at index :  "+result);

	}
}
