import java.util.Scanner;
import java.util.Arrays; 

public class Main {  
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {  
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {  
                mid++;
            } else {  
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        sortColors(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
        scanner.close();
    }
}