package rvt;
import java.util.Scanner;

public class sumofnum {
    Scanner sc = new Scanner(System.in);
    int num = 1223;
    int sum = 0;
    int skaits = 0;
    
    {while (num != 0) {
        System.out.println("Give a number: ");
        num = sc.nextInt();
        sum = sum + num;
        skaits++;
        if  (num == 0) {
            System.out.println("Number of numbers: " + skaits);
            System.out.println("Sum of the numbers: " + sum);
            break;
        }
    }
}}
