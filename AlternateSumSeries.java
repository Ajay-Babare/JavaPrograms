import java.util.Scanner;

public class AlternateSumSeries {
	public static int alternateSumFind(int num) {
		//baser case condition
		if(num ==  0)
			return 0;
		//recursive function call
		if (num%2 == 0)
			return alternateSumFind(num-1)-num;
		else
			return alternateSumFind(num-1)+num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int result = alternateSumFind(num);
		System.out.println("The alternate Sum series is : "+result);
	}
}
