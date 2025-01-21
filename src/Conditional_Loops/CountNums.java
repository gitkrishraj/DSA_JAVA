package Conditional_Loops;

public class CountNums {
    public static void main(String[] args) {
        int n = 645767356;

        int count = 0;
        while( n>0){
            int rem = n%10;
            if(rem == 6){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
