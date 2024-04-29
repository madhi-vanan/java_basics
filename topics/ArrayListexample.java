    import java.util.Arrays;
    import java.util.*;
    public class ArrayListexample {
        public static void main(String[] args) {
            int[] arr ={1,2,3,4,5};
         //   swap(arr,1,2);
         reverse(arr);
       System.out.println(Arrays.toString(arr));
        }
    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

            while(start<end){
              
                swap(arr,start,end);
                end--;
               start++;
            }

    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    
        }
    }
