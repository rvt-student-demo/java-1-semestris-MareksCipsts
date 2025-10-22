package rvt;
import java.util.Scanner;
public class pos {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Give a number: ");
    int num = 0;
    int res = 0;
    while (num > 0) {
        System.out.print("Give a number:");
        num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Unsuitable number");
        }
        res = num * num;
        System.out.println(num);
    }
}
}