import java.util.Scanner;

public class PrefixSum2D {

	public static int prefixSumImpl(int [][] arr,int r1,int c1,int r2,int c2) {
		int sum=0;
		for(int i=r1; i<=r2; i++) {
			for(int j=c1;j<=c2;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter R1: ");
		int r1 = sc.nextInt();
		System.out.println("Enter C1: ");
		int c1 = sc.nextInt();
		System.out.println("Enter R2: ");
		int r2 = sc.nextInt();
		System.out.println("Enter C2: ");
		int c2 = sc.nextInt();
		
		int result = prefixSumImpl(arr, r1,c1,r2,c2);
		System.out.println("Sum of Rectangle is : "+result);
		
	}

}
