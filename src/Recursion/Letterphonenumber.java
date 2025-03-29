package Recursion;

public class Letterphonenumber {
    public static void main(String[] args) {
    letterphonenumber("","12");
    }
    static void letterphonenumber(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit= up.charAt(0) - '0';  // this will convert '2' into 2

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
          char ch= (char)('a' +i);
          letterphonenumber(p+ch,up.substring(1));

        }
    }
}
