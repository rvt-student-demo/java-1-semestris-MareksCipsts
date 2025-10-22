package rvt;
import java.util.Scanner;
public class chapter60 {
    public static void main (String[] args) {
        System.out.println("Enter a number \"4\"");
        System.out.println("");
        int sk = 0;
        Scanner sc = new Scanner(System.in);
        while (sk != 4) {
            System.out.print("Enter a number:");
            sk = sc.nextInt();
            if (sk != 4) {
                System.out.println("Try again!");
                System.out.println("");
            }
        }
        
        System.out.println("Congratulations, you did it!" );
    }
}
