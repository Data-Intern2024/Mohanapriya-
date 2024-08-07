package arrays;
import java.util.Scanner;
public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("max value"+ " "+max);
        System.out.println("min value"+ " "+min);
    }
}






      /*  for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int max=a[n-1];
        int min=a[0];
        System.out.println("max number in array"+"="+max);
        System.out.println("min number in array" + "=" +min);
*/



