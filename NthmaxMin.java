package arrays;
import java.util.Scanner;
public class NthmaxMin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        System.out.println("enter the value to be insert");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("enter the value nth max and min");
        int k=sc.nextInt();
        System.out.println(k + "th max element in an array: "+ a[a.length-k]);
        System.out.println(k + "th min element in an array: "+ a[k-1]);

    }
}
