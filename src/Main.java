import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
       int a[]=new int[n];

       double y=1;
       for (int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       System.out.print("m= ");
        int m= in.nextInt();
for (int i=0;i<n;i++){
    if (a[i]>m){
        y*=a[i];
    }
}
        System.out.printf("%.2f",Math.log(y));
    }
}