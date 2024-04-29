import javax.swing.plaf.TreeUI;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr ={5,7,8,9,14,16,18};
        int ans=agnosticBS(arr, 16);
        System.out.println(arr[ans]);
    }
    static int binaryS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target > arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){     
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    static int agnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean Asc = arr[start]<arr[end];
        // boolean Asc;
        // if(arr[start]<arr[end]){
        //     return true;                        // this if condition can be shorted as boolean Asc = arr[start]<arr[end];
        // }
        // else{
        //     return false;
        // }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==mid){
                return mid;
            }
            if(Asc){
                if(target > arr[mid]){
                    start=mid+1;
                }
                else {     
                    end=mid-1;
                }
            }
            else{
                if(target < arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){     
                    end=mid-1;
                }
            }
        }
            return -1;
    }
}
