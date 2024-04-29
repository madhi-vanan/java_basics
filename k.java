import java.util.Scanner;

class k{
    public static void main(String[] args) {
      //  char b ='a';
      //  int i=50000;
      //  double res=i/b;
      //  System.out.println(res);

      //fibonoci series ;
      Scanner sc =new Scanner(System.in);
      int a,b,n,temp;
      n=sc.nextInt();
      a=0;
      b=1;
      int count=2;
      while(count<=n){
         temp=b;
         b=b+a;
         a=temp;
      }
         System.out.println(b);

    }
 }