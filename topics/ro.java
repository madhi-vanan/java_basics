import java.util.Arrays;

public class ro {
    public static void main(String[] args) {
      int[] num={0,2,1,5,3,4}; 
      
       System.out.println(Arrays.toString(array(num)));
    }
    static int[] array(int[] num){
        int[] ans=new int[6];
        for(int i=0;i<num.length;i++){
            ans[i]=num[num[i]];
        }
        return ans;
    }
}
