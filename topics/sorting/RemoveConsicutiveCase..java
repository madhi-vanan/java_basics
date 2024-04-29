import java.util.Scanner;

public class RemoveConsicutiveCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    
        System.out.println(remove(s));
    }
    static String remove(String s){
        String neew;z
        for(int i=0;i<s.length();i++){
        if((Character.isUpperCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i-1))) || (Character.isUpperCase(s.charAt(i-1)) && Character.isUpperCase(s.charAt(i))) ) {
            neew+=s.charAt(i);
        }
    }
    return neew;
}
}

