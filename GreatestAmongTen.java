
public class GreatestAmongTen {
	
	public static int findGreatest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 30, 5, 45, 25, 50, 15, 35, 20, 40 };
        int greatest = findGreatest(numbers);
        System.out.println("The greatest number is: " + greatest);
    }
}
