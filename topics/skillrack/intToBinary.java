import javax.sound.midi.SoundbankResource;

public class intToBinary {
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        int a=46;
       Binary(a);
        
    }
    static String tostring(char[] a){
        String string=new String(a);
        return string;
    }
  static void Binary(int a){
    String b=Integer.toBinaryString(a);
    char[] ch=new char[b.length()];
    for(int i=0;i<b.length();i++){
        ch[i]=b.charAt(i);
    } 
    for(int i=0;i<3;i++){
    char first=ch[i];
    } 
    for(int i=ch.length-4;i<ch.length;i++){
        char last=ch[i];
        } 
   String firstvalue=tostring(first);
    String lastvalue=tostring(last);
    System.out.println(firstvalue);
    System.out.println(lastvalue);
 }
}
