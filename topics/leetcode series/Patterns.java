import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Patterns {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //    int n=sc.nextInt();
    //        pattern2(n);
    pattern5(4);
        
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){                               // *
            for(int j=1;j<=i;j++){                           // * * 
                System.out.print("* ");                   //  * * * ...
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){                               // * * *
            for(int j=1;j<=n;j++){                           // * * *
                System.out.print("* ");                   //  * * * ...
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){                          // * * * *   row=1 col=4       n
           for(int j=1;j<=n-i+1;j++){                   //* * *     row=2 col=3         n-1
                System.out.print("* ");              //* *        row=3 col=2         n-2
        }                                               //*         row=4 col=1          n-3
        System.out.println();
    }
}
   static void pattern4(int n){
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print(col+" ");
        }
            System.out.println();
    }
   }
   static void pattern5(int n){
    for(int row=1;row<=n*2;row++){
        int totpat=row<n ? row :2*n-row;
        int totalspace=n-row;
        for(int s=1;s<=totalspace;s++){
            System.out.print(" ");
        }
        for(int col=1;col<=totpat;col++){
            System.out.print("*");
        }

        System.out.println();
    }
   }
}
