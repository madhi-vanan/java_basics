public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
          //  int a=78; // gives error 'a' is already created in outer block " int indicate that the variable iss creating again"
          int c=189; // inside the box cant be access outsside;;
          a=100; // it is replacing the existing value in the ouuter block , absence of int shows that it is replacing the existing value   
        }
        System.out.println(a);
      //  System.out.println(c);// inside the box cant be access outsside;;
    }
}
