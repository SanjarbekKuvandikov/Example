import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Reverse_words revwo =new Reverse_words();
       String word = in.nextLine();
       revwo.revwords(word);
    }
}