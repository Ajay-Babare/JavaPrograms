import java.util.Scanner;

public class PowerOfElement {

	public static int powerFind(int a, int b) {
		int mid = 0,result = 0, finalResult = 0;
		if (b == 1) {
			return a;	
		}
		else {
			mid = b/2;
			result = powerFind(a,mid);
			finalResult = result * result;
			if(b%2==0) {
				return finalResult;
			}
			else {
				return a * finalResult;
			}
				
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = powerFind(a,b);
		
		System.out.println("Power of a ^ b : "+result);
	}
}
