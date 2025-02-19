package String;

public class Performane {
    public static void main(String[] args) {
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            System.out.println(ch);
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < 26; i++) {
           char ch = (char)('a' + i);
        builder.append(ch);
        }
        System.out.println(builder.toString());
        
        builder.reverse();
        System.out.println(builder);
    }
}
