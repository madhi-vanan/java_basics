import java.util.Arrays;

public class BuildAnarrayPermutation {
    public static void main(String[] args) {
        int[] num={0,2,1,6,3,4};
        int[] a=buildArray(num);
        System.out.println(Arrays.toString(a));
    }
     static int[] buildArray(int[] nums) {
        int[] ans=new int[6];
      for(int i=0;i<nums.length;i++){
         
            ans[i]=nums[nums[i]];
          
      }  
        return ans;
    }
}
public int[] buildArray(int[] nums) {
    int l= nums.length;
    for(int i=0; i<l; i++){
    nums[i] = nums[i] + l*(nums[nums[i]] % l);
    }
    for(int i=0; i<l; i++){
    nums[i] = nums[i]/l;
    }
    return nums;
    }
