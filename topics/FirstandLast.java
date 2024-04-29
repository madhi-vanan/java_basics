import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,3,3,4,6,7,9,10};
        int target=13;
        int[] ns=FirstLast(arr, target);
        System.out.println(Arrays.toString(ns));
    }
    static int[] FirstLast(int[] arr, int target){
        
       int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
      ans[1]=search(arr,target,false);
         
         return ans;
    }
  static int search(int[] arr,int target,boolean value){
    int ans=-1;
        int start=0;
        int end=arr.length-1; // 1 2 3 3 3 3 6 7

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(value){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return ans;
    }
}
