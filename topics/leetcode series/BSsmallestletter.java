public class BSsmallestletter {
    public static void main(String[] args) {
        char[] arr={'b','c','d','j'};
        char a=bs(arr, 'j');
        System.out.println(a);
    }
    static char bs(char[] arr,char target){
        int  start=0;
        int end=arr.length-1;
        while(start<=end){
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

        }
        return arr[start%arr.length];
    }
}
