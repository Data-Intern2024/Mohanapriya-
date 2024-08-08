package arrays;
import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array =new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        // Linear Search
        System.out.println("enter the element to be search: ");
        int target = sc.nextInt();
        int linearResult = linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index: " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found in the array");
        }

        // Binary Search
        int binaryResult = binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index: " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found in the array");
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int lower = 0;
        int upper = array.length - 1;

        while ( lower <=upper) {
            int mid =  lower + (upper -  lower) / 2;


            if (array[mid] == target) {
                return mid;
            }


            if (array[mid] < target) {
                lower = mid + 1;
            } else {

                upper = mid - 1;
            }
        }

        return -1;
    }
}

