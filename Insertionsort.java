package sorting;
import java.util.Scanner;
public class Insertionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("BEFORE SORTING: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{
                    break;
                }

            }
        }

        System.out.println("AFTER SORTING: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
