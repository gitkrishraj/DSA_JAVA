package Recursion;

public class Subsequence {
    public static void main(String[] args) {
    subseqence("","abc");
    }
    static void subseqence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqence(p + ch, up.substring(1));
        subseqence(p,up.substring(1));
    }
}
