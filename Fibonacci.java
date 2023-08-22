import java.util.Scanner;

public class Fibonacci {

	public static int checkFibonacci(int n) {
		int result = 0;
		// Base case condition
		if(n<=1)
			return n;
		//Recursive function call
		else
			result = checkFibonacci(n-1) + checkFibonacci(n-2);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int result = checkFibonacci(n);
		System.out.println("The result of fibonacci number is : "+result);
		

	}

}
