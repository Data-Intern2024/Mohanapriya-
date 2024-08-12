package search;
import java.util.Scanner;


public class LinearSearchMultipleOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}

