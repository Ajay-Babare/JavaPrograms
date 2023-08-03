
public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8};
		
		//Sum of Natural number with missing no.
		int sumNaturalNo = ((arr.length+1)*(arr.length+2))/2;

		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int result = sumNaturalNo - sum;
		System.out.println("Missing no. is: "+result);		
	}
}
