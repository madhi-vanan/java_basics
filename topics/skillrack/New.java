import java.util.Scanner;
import java.lang.Math;
public class S30_12DC {
    public static void main(String[] args) {
       Scanner  sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int arr[]=new int[n];
       int count=0;
       for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
        int r=arr[i]*arr[i] +m;
        if((r%10) != 5 && (r%10) !=6){
            System.out.print(r+" ");
          count++;
        }
        
       }
       if(count==0){
        System.out.print(-1);
       }
    }
}
