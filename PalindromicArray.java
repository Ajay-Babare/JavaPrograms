//Time Complexity: O(n)
//Space Complexity: O(1)

public class PalindromicArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		boolean flag = false;
		
		for(int i=0; i<arr.length/2;i++) {
			if(arr[i] != arr[arr.length-i-1]) {
				flag = true;
				System.out.println("Not a palindromic array");
				break;
			}
		}
		
		if(flag==false)
			System.out.println("Palindromic array");
		
	}
}
