package rvt;
import java.util.Scanner;
class statisticspart333 {
    private int sum;
    public statisticspart333() {
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.sum = this.sum + number;
    }
    public int Sum() {
        return this.sum;
    }
}
public class statisticspart3 {
    public static void main(String[] args) {
        statisticspart333 statistics = new statisticspart333();
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                statistics.addNumber(number);
                break;
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.Sum());
    }
}
