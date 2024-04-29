import java.util.*;
import java.lang.Math;
public class SquareRTDigits {
    public static void main(String[] args) {
        int a=4567;
        int r=0;
        while(a>0){
            r=a%10;
            System.out.printf("%.2f",Math.sqrt(r));
            System.out.print(" ");
            a/=10;
        }
        

    }
}
