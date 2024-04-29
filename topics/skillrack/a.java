import java.util.Scanner;
import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new  int[n];
      
        

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(hi(arr,n)));
        // for(int i=even(arr, n);i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

    }
    static int even(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                return i;
            }
        }
        return 0;
    }
    static int[] hi(int[] num,int target){
        HashMap<Integer,Integer> comp=new HashMap<>();
        for(int i=0;i<num.length;i++){
            Integer compIndex=comp.get(num[i]);
            if(compIndex!=null)
            {
                return new int[]{i,compIndex};
            }
            comp.put(target-num[i], i);

        }
        return  num;
    }
}
