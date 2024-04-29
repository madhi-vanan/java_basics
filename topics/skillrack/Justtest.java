import java.util.Scanner;
import java.util.Arrays;

public class Justtest {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 int n=sc.nextInt();
 System.out.println(num%10);
// pattern1(4);
// int[]  arr=new int[100];
// int sum=0,product =1,i=0;
// while(n>0){
//     arr[i]=n%10;
//     n=n/10;
//     i++;
// }

// if(n%2==0){
// for(i=0;i<arr.length;i++){
//  sum+=arr[i];}
// System.out.println(sum);

// }
// else{

// for(i=0;i<arr.length;i++){
// product=arr[i]*product;}

// System.out.println(product);
    
// }


    }

    static void hi(int num, int n){
        int[] arr=new int[100];
        int i=0;        // n=12345
        while(num>0){
            arr[i]=num%10;
            num=num/10;
            i++;
        }
  
    System.out.print(arr[i]);
  
    }


    // static void pattern1(int n)
    // {
    //     int printval,diff;

    //     for(int row=1;row<=n;row++){
    //         if(row%2==0){             
    //           printval=n*row;
    //           diff=-1  ;
    //         }
    //         else{
    //             printval=(row-1)*n+1;
    //             diff=1;
    //         }
    //         for(int col=1;col<=n;col++){
    //             System.out.print(printval+" ");
    //             printval=printval+diff;
    //         }
    //         System.out.println();
    //     }
    // }

}
