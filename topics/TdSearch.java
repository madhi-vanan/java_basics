import java.util.Arrays;

public class TdSearch {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{23,45,56,67},{34,53,65}};
        int[] ans=search(arr,23);
        System.out.println(Arrays.toString(ans));


    }
    static  int[] search(int[][] arr,int target){
            if(arr.length==0){
                return new int[]{-1,-1}; 
            }
            
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]==target){
                        return new int[]{i,j};
                    }
                }
            }
                return new int[]{-1,-1};
    }
}
