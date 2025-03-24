package Recursion;

public class Ascii {
//    public static void main(String[] args) {
//        char ch ='a';
//        System.out.println((char)(ch+ 1));
//    }
//public static void main(String[] args) {
//    char ch = 'D';
//    System.out.println(ch +0);
//}
public static void main(String[] args) {
  subseqenceAscii("","abc");
}
    static void subseqenceAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqenceAscii(p + ch, up.substring(1));
        subseqenceAscii(p,up.substring(1));
        subseqenceAscii(p +(ch+0),up.substring(1));
    }
}
