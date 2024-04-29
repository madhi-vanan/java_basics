
import java.util.Arrays;
import java.util.Scanner;


public class Arrays2 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  //  // syntax :: datatypes[] variable_name = new int[size];
    int[][] rno = new int[3][3];  // by default the int data type have filled with 0 :: thats is {0,0,0,0,0}
   String[] str= new String[4];// by default the String  data type have filled with NULL :: thats is {NULL,NULL,NULL,NULL} NULL is only for the string datatype
  // System.out.println(arr[2]);
  // System.out.println(rno[2]);

     for(int i =0;i<rno.length;i++){

    
       // System.out.print(arr[i] + " ");
       for (int j=0;j<rno[i].length;j++){
        rno[i][j]=sc.nextInt();
       }
    }
    for(int i =0;i<rno.length;i++){

    System.out.println();
        // System.out.print(arr[i] + " ");
        for (int j=0;j<rno[i].length;j++){
       System.out.print(rno[i][j] + " ");
        }
     }
  // System.out.println(Arrays.toString(rno));
   for(int[] a : rno) {
                System.out.println();
            System.out.println(Arrays.toString(a));}

//      int[] totals = {1,2};
//   System.out.println(Arrays.toString(totals));
}
}
