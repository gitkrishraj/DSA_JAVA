package Recursion;

public class Mazediagonal {
    public static void main(String[] args) {
     pathdiagonal("",3,3);
    }
    static void pathdiagonal(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            pathdiagonal(p +'D',r-1,c-1);
        }
        if(r>1){
            pathdiagonal(p + 'V',r-1,c);
        }
        if(c>1){
            pathdiagonal(p + 'H',r,c-1);
        }
    }
}
