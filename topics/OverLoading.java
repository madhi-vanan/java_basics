import java.util.Arrays;
public class OverLoading {
    public static void main(String[] args) {
           //overloading
         // overloading the method which as multiple  no. of same methods but the arguments in it will be differ
         // eg fun(int a)  , fun(String name )   , fun(int a, int b)
        // fun("madhi");                         // here it autommatically taking the value as string

        // fun(7);                                      // here it automaticcally taking the value as integer 

        int ans=sum(6,7,8);
        System.out.println(ans);
    }
    static void fun(int v){
       System.out.println(v);
    }
    static void fun(String name){
        System.out.println(name);
    }
                    // same datatypes
    static int sum(int a, int b ){
        return a+b;
    }
    static int sum(int a, int b ,int c){
        return a+b+c;
    }
    
}
