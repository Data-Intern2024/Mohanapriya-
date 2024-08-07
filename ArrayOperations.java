package arrays;
import java.util.Scanner;

public class ArrayOperations {

    private static int[] array = new int[100];
    private static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Insert at specific position");
            System.out.println("3. Search");
            System.out.println("4. Delete at specific position");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    insertAtPosition(scanner);
                    break;
                case 3:
                    search(scanner);
                    break;
                case 4:
                    deleteAtPosition(scanner);
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void insert(Scanner scanner) {
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        if (size < array.length) {
            array[size++] = element;
            System.out.println("Element inserted.");
        } else {
            System.out.println("Array is full. Cannot insert element.");
        }
    }


    public static void insertAtPosition(Scanner scanner) {
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position (0-based index) to insert: ");
        int position = scanner.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
        } else if (size < array.length) {
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = element;
            size++;
            System.out.println("Element inserted at position " + position + ".");
        } else {
            System.out.println("Array is full. Cannot insert element.");
        }
    }

    public static void search(Scanner scanner) {
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Element found at position " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    public static void deleteAtPosition(Scanner scanner) {
        System.out.print("Enter the position (0-based index) to delete: ");
        int position = scanner.nextInt();
        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
        } else {
            for (int i = position; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Element deleted at position " + position + ".");
        }
    }

    public static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
