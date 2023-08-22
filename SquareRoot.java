//Approach : Modifies binary Search
//Time complexity: O(log n)
//Space complexity: O(1);
import java.util.Scanner;

public class SquareRoot {

	public static int findSquareRoot(int num) {
		int low = 0, high = num, result= -1;
		
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			long val = mid * mid ;
			
			if(val == num) {
				return mid;
			}
			else if(val < num) {
				result=mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;	
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find square root :: ");
		int num = sc.nextInt();
		
		int result = findSquareRoot(num);
		
		System.out.println("Square root is "+result);
		

	}

}
