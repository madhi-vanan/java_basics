import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
      //  int[] arr = {12,34,23,45,67,24,56};    
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the seaarch element :" );
        int target =  sc.nextInt();
            int ans=Linearsearch(arr, target);
            System.out.println( "the element is found at the index ::"+ans);
    }
    static int Linearsearch(int[] arr,int target){
            if(arr.length==0){
                return Integer.MAX_VALUE;
            }
            for(int index=0;index<arr.length;index++){
                int element =arr[index];
                if(element==target){
                    return  index ;
                }
            }

            return -1;
        
        
        }
    }

