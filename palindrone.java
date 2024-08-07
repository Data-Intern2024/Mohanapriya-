package arrays;

import java.util.Scanner;

public class palindrone {

    static void palindrome(int arr[], int n){

        int flag = 0;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (arr[i] != arr[n - i - 1]) {
            flag = 1;
            break;
            }
        }
    if (flag == 1)
        System.out.println("Not Palindrome");
    else
        System.out.println("Palindrome");
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    palindrome(arr, n);
}
}