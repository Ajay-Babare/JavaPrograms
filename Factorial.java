
public class Factorial {
	
	public static int checkFactorial(int num) {
		if(num == 0 || num == 1)
			return 1;
		else
			return num * checkFactorial(num - 1);
	}
	
	public static void main(String[] args) {
		int number = 5;
		int result = checkFactorial(number);
		System.out.println("Factorial of a "+number+" is "+result);
	}
}
