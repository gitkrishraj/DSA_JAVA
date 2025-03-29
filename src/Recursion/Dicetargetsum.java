package Recursion;

public class Dicetargetsum {
    public static void main(String[] args) {
      dicetargetsum("",4);
    }
    static void dicetargetsum(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dicetargetsum(p+i,target-i);

        }
    }
}
