package rvt;
import java.util.Scanner;
public class sumofasequence {
    public static void main (String[] args) {
        System.out.println("Last number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i != num + 1; i++) {
            sum = sum + i;
            }
        
        if (num < 1) {
            System.out.println("Enter a number greater than 0 next time!");
        }
        else { 
            System.out.println("The sum is " + sum);
}
}
}