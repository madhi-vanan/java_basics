import java.util.*;
import java.util.Scanner;
public class S26_12_22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       while(n>0){
        n=n%10;
        binary(n);
        n/=10;
       }

       
    }
    static int binary(int n){
        int a=Integer.toBinaryString(n);
        System.out.print(a);
    }
}