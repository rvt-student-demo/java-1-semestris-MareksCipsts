package rvt;
import java.util.Scanner;
public class repbrandrem {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        double avg = 0;
        int oddcount = 0;
        int evencount = 0;
        int num = 0;
        System.out.println("Give numbers:");
        while (num != -1) {
            num = sc.nextInt();
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + num;
            counter++;
            if (num == 0){
                continue;
            }
            if (num % 2 == 0) {
                evencount++;
            }
            if (num % 2 == 1) {
                oddcount++;
            }
        }
        avg = (double) sum / counter;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evencount);
        System.out.println("Odd: " + oddcount);
    }
}
