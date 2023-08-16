import java.util.Scanner;

public class NumberOfStairs {
	public static int countWays(int n) {
		int result = 0;
		if(n<=1) {
			return n;
		}
		else {
			result = countWays(n-1)+ countWays(n-2);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Stairs : ");
		int n = sc.nextInt();
		
		//function calling
		//relation between count of stairs and fibonacci series
		int result = countWays(n+1);
		System.out.println("Number of ways is : "+result);
	}
}
