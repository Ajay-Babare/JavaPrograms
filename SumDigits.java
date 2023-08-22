
public class SumDigits {

	public static int sumOfDigits(int num) {
		//Base Case Condition
		if(num == 0)
			return 0;
		//Recursive Function Call
		else
			return (num%10)+ sumOfDigits(num/10);
	}
	public static void main(String[] args) {
		int num =123456;
		int result = sumOfDigits(num);
		System.out.println("The of the given digits is : "+result);
	}
}
