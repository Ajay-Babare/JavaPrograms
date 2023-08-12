import java.util.HashSet;

public class FindDuplicateElements {

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
    
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};
        findDuplicates(array);
	}
}
