import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        System.out.println("Enter elements (non-negative integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        Solution_day2.moveZerosToEnd(arr);

        // Output result
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

class Solution_day2{
    public static void moveZerosToEnd(int arr[]) {
        int j = 0;  // Position to place the next non-zero element

        // First pass: move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill remaining places with zero
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }
}
