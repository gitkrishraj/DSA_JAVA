package Recursion;

public class CountNumber {
    public static void main(String[] args) {
    System.out.println(count(73653836));
    }
   static int count (int n){
        return helper(n,3);
   }
   private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem= n %10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
   }
}
