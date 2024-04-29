import java.util.Scanner;
import java.util.Arrays;
public class Try {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[30];
        int a=sc.nextInt();
        while(a>0){
            arr[a%10]++;
            a/=10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
