import java.util.Arrays;

public class AccountWealth {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{23,3},{3,5}};
        int a=Maxwealth(arr);
        System.out.println(a);
    }
    static  int Maxwealth(int[][] arr){
        int ans =Integer.MIN_VALUE;     //  plz dont initialize  thhe new values inside the loop it will again change  the value  eg. consider 1 
        for(int i=0;i<arr.length;i++){
            int sum=0;    // initaializing every  index of i as 0 to get the separate summ for each row;;
         for(int j=0;j<arr[i].length;j++){
            sum+=arr[i][j];
         }   
                // if i initialize the ans value here then the ans value will be minvalue for the each iterationn so  dont repeat it
         if(sum>ans){
             ans=sum;
         }
        }
        // let consider the ans as min value coz to compare them with the other arrays
       return ans;
    }
}
