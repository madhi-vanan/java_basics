import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import javax.sound.midi.SoundbankResource;

public class Function {
    public static void main(String[] args) {
                                           // START OF MAIN FUNCTION
                    // sum3();

    // String pres = mygreet("   madhi");
    // System.out.println(pres);

                        // eg1
    // String name = "akshay";
    // name(name);
    //     System.out.println(name);

                        // eg2
    // String name= name("aksay");
    // System.out.println(name);
   swap(1,2);
  
   
                                        // END OF MAIN FUNNCTION
    }

    static String mygreet(String name){
        String message  = "hello" +name;
        return message;

    }
     static int sum2(int a, int b){
        int sum=a+b;
        return sum;
     }   
     static void sum3(){     // you should return the integer  value unless use " void " 
     Scanner sc =new Scanner(System.in);
     System.out.print("enter the numbers:  ");
     int a,b,sum;
     a=sc.nextInt();
     b=sc.nextInt();
     sum=a+b;
     System.out.println(sum);    // function call is over get out of  the loop

 }



    static int sum(){     // you should return the integer  value unless use " void " 
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the numbers:  ");
        int a,b,sum;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        return sum;    // function call is over get out of  the loop

    }

    static String name(String naam){
        naam="hindi bhaiya"; //creating the new object 
      return naam;
    }
  static void swap(int num1,int num2){
    int tempt =num1;
    num1=num2;
    num2=tempt;
    System.out.println(num1 +" " +num2);
  }
}
