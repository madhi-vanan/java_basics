import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int pass=0;pass<arr.length;pass++){
            for(int j=1;j<arr.length-pass;j++){ // it is "arr.length -pass" coz after the pass=0 the  last element will be eliminated that is [1,2,3,4]
                                            // it will be thee length=4, for first comparison it will be 3 ,  "as first element is not considered
                                            // the pass=1,,l=4 , then the last element is already sorted we will leave that so now apply that "4-1"=3
                if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
