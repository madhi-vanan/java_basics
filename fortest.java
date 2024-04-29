import java.util.Scanner;
class fortest{
public static void main(String args[]){
System.out. println("hi \t llo \n vanakam");
/*hi comment */
Scanner sc= new Scanner(System.in);
String hi=sc.nextLine();
int bi=sc.nextInt();
sc.nextLine(); //needed if the next line is appereard  after the next int 
String ji=sc.nextLine();
System.out.println("string "+hi);
System.out.println("next int "+bi);
System.out.println("string again "+ji);
}

}


