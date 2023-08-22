
public class PrintMultiples {
	public static void printMult(int n, int k) {
		// base case condition
		if(k == 1)
			System.out.println(n);
		//recursive function call
		else {
			printMult(n,k-1);
			System.out.println(n*k);
		}
	}
	public static void main(String[] args) {
		int n = 25;
		int k = 5;
		printMult(n,k);
		System.out.println();
	}
}
