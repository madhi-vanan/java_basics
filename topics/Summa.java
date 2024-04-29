import java.util.Arrays;


 public class Summa {
//     public static void main(String[] args) {
//     //     char[] letter={'a','b','c','d','e','f','g'};
//     //    char s=Smallest(letter,'e');
//     //    System.out.println(s);
//     // }
//     }
    // static char Smallest(char[] letter,char target){
    //     int start=0;
    //     int end=letter.length-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(target<letter[mid]){
    //             end=mid-1;
    //         }
    //         else {
    //             start=mid+1;
    //         }
            
    //     }
    //     return letter[start%letter.length];
    // }

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int max=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//                 if(nums[i]==1)count++;
//                 else {
//                  max=Math.max(max,count);
//                  count=0;
//                 }
//         }
//         max=Math.max(max,count);
//         return max;
//     }

//}

    public static void main(String[] args) {
            int[] nums={1,2,3,3,3,3,3,3,4,5,6,7,88};
            int target=3;
            int[] ans=searchRange(nums, target);
            System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}