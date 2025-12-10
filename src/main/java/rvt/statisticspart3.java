package rvt;
import java.util.Scanner;
public class statisticspart3 {
    private int sum;
    public statisticspart3() {
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.sum = this.sum + number;
    }
    public int Sum() {
        return this.sum;
    }
}
class Main {
    public static void main(String[] args) {
        statisticspart3 statistics = new statisticspart3();
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
