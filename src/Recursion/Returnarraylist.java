package Recursion;

import java.util.ArrayList;

public class Returnarraylist {
    public static void main(String[] args) {
      System.out.println(returnarraylist("","abc"));
    }
    static ArrayList<String> returnarraylist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = returnarraylist(p + ch, up.substring(1));
        ArrayList<String> right = returnarraylist(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
