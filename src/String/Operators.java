package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b");// ab
        System.out.println('a' + 5);//102
        System.out.println("a" + 5);//a5
        System.out.println("Krish" + new ArrayList<>());//Krish[]
        System.out.println("Krish" + new Integer(45));
    }
}
