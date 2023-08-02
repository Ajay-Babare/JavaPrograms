
public class EvenOrOdd {
	
	public static boolean isEven(int number) {
		return (number & 1) == 0;
	}

	public static void main(String[] args) {
		int number = 15;
	    if (isEven(number)) {
	    	System.out.println(number + " is even.");
	    } else {
	    	System.out.println(number + " is odd.");
	    }
	}	
}
