
public class PrefixSum1D {

	public static void main(String[] args) {
		int [] arr= {1,1,1,1};
		
		System.out.println("Before Prefix Sum");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		//logic of prefix sum
		for(int i=1; i<arr.length;i++) {
			arr[i]+=arr[i-1];
		}
		
		System.out.println("\nAfter Prefix Sum");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
