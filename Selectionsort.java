package sorting;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("BEFORE SORTING: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < n; i++) {
            int minIn = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIn]) {
                    minIn = j;
                }

            }

            int temp=a[minIn];
            a[minIn]=a[i];
            a[i]=temp;
        }

        System.out.println("AFTER SORTING: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
