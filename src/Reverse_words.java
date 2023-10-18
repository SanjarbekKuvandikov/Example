import java.util.Scanner;

public class Reverse_words {
    public String revwords(String revw){
        Scanner in = new Scanner(System.in);
        String t="";
        for (int i = revw.length()-1; i >=0; i--) {
            t += revw.charAt(i);

        }
        System.out.println(t);
       return t;


    }
}
