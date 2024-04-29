import java.util.*;
import java.util.Scanner;
public class tyty{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
      while(n>0){
        r=n%10;
       System.out.println(binary(r));
        n/=10;
      }
    }
    static String binary(int n){
        String a=Integer.toBinaryString(n);
        return a;
    }
}/* 
import java.util.*;
import java.util.Scanner;
public class S26_12_22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         int rem=0;
        while(n>0){
            rem=n%10;
            binary(rem);
            n/=10;
            System.out.println();
        }
    
    }
    static void binary(int n){
    int[] arr=new int[4];
    int i=3;
    while(n>0){
        arr[i]=n%2;
        n/=2;
        i--;
    }
for(int a:arr){
    System.out.print(a);
}
    }
} 
//// ans 26/12
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++){
		    String s1=Integer.toBinaryString(s.charAt(i));
		    StringBuilder g=new StringBuilder(s1);
		    g.replace(0,2,"");
		    System.out.println(g);
		}

	}
}



*/