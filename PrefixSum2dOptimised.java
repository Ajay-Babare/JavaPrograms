import java.util.Scanner;

public class PrefixSum2dOptimised {
	
	public static int prefixSum(int arr[][]) {
		
		//row sum
		for(int i=0; i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++) {
				arr[i][j]+=arr[i][j-1];
			}
		}

		//column sum
		for(int j=0;j<arr[0].length;j++){
			for(int i=1;i<arr.length;i++){
				arr[i][j]+=arr[i-1][j];
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r1: ");
		int r1 = sc.nextInt();
		System.out.println("Enter c1: ");
		int c1 = sc.nextInt();
		System.out.println("Enter r2: ");
		int r2 = sc.nextInt();
		System.out.println("Enter c2: ");
		int c2 = sc.nextInt();
		
		int result=0, sum=0,u=0,d=0,r=0;
		u=arr[r1-1][c2];
		d=arr[r2][c1-1];
		r=arr[r1-1][r1-1];
		sum=arr[r2][c2];
		result=sum-u-d+r;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter no. of column: ");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		System.out.println("Enter matrix numbers: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int result = prefixSum(arr);

		System.out.println("Result "+result);
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[0].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
	}

}
