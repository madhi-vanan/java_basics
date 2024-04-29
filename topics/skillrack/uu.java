import java.util.Arrays;
public class uu{
    public static void main(String[] args) {
        int[] nums =
        {1,5,-2,-4,0};
      //  Arrays.sort(nums);
        System.out.print(99%2);
       // System.out.print(Arrays.toString(nums));
 //System.out.print(containsDuplicate(nums));
    }
  
    static boolean containsDuplicate(int[] nums) {
            int[] digit =new int[10];
            int n=0,i=0;
         
            while(n<nums.length){
                digit[nums[i]]++;
            i++;
            n++;
            }
            for(int val:nums){
                if(digit[val]==2){
                    return true;
                }
            }
            return false;
        }
    }
        //  13_12_22 ans
    /* 
    import java.util.*;
    public class Hello {
    
        public static void main(String[] args) {
            //Your Code Here
    Scanner in=new Scanner(System.in);
    String t=in.nextLine();
    int i=0;
    int j=t.length()-1;
    while(i<=j)
    {
        if(i==j)
        {
            System.out.print(t.charAt(i));return;
        }
        System.out.print(t.charAt(i)+""+t.charAt(j));
        if(t.charAt(i)==t.charAt(j))
        {
            break;
        }
        i++;j--;
    }
        }
    } */
