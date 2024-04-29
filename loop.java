import java.util.Scanner;

import javax.sound.midi.SoundbankResource;
public class loop{
    public static void main(String[] args) {
        
    //   fibonaci series

        Scanner sc =new Scanner(System.in);
        int a,b,n,temp;
        n=sc.nextInt();
        a=0;
        b=1;
        int count=2;
       for(count=2;count<=n;count++){
        System.out.print(a+": "+b +" :: ");
        temp=b;
        b=b+a;
        a=temp;
    
    }
    
       // COUNTING OCCURANCES::::

    //     Scanner sc =new Scanner(System.in);
    //    int n=sc.nextInt();
    //    int count=0,t;
    //    while(n>0){
    //      t=n%10;
    //     if(t == 3){
    //         count++;
    //     }
    //     n=n/10;


    //    }
    //    System.out.println(count);

           // REVERSE OF NUMBER  ///

        //   Scanner sc = new Scanner(System.in);
        //   int n=sc.nextInt();
        //   int ans=0;
        //    while(n>0){
        //     int rem =n%10;
        //     n/=10;
        //     ans=ans*10+rem;

        //    }
        //    System.out.println(ans);

                // switch case another form
        
                // Scanner sc = new Scanner(System.in);
                // int n=sc.nextInt();
                // switch(n){
                //     case 1,2,3,4,5 -> System.out.println("weekdays");
                //     case 6,7 -> System.out.println("weekend");
                // }

    }
}