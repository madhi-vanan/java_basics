import java.util.Scanner;
public class t {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[] arr=new int[N];
for(int idx=0; idx<N; idx++)
 {
   arr [idx] =sc.nextInt( ) ;
}
int[] digits=new int[10];
int k=sc.nextInt();
while(k>0) {
digits[k%10]++;
k/=10;
}
for(int val:arr) {
if (digits [val]==0){
System.out.print( "NO");
return;
}
}
System.out.print( "YES" ) ;
    }

}