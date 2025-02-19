import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min heap

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }
        return minHeap.peek(); // Kth largest element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // User input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // User input for k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Finding and printing the kth largest element
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));

        scanner.close();
    }
}