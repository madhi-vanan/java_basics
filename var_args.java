import java.util.Arrays;
public class var_args {
    public static void main(String[] args) {
        fun(45,45,66,67);
        multitype(90, 78, "hi","hello");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multitype(int a,int b,string ...a){
        System.out.println(Arrays.toString(a));
}
