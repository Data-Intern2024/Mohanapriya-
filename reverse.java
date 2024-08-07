package arrays;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int j=n;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        for(int k=0;k<n;k++){
            System.out.println(b[k]);
        }

    }
}
