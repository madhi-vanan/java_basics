public class ArrayList {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Swap(arr,1,2);
        System.out.println(arr);

        static void  Swap(int[] arr,int intex1, int index2){
            int temp =arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
    }
}
