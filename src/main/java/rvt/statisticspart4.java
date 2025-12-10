package rvt;

import java.util.Scanner;

class statisticspart444 {
    private int sum;
    private int evensum;
    private int oddsum;

    public statisticspart444() {
        this.sum = 0;
        this.evensum = 0;
        this.oddsum = 0;
    }
    public void addNumber(int number) {
        this.sum = this.sum + number;
        if (number % 2 == 0) {
            this.evensum = this.evensum + number;
        } 
        else {
            this.oddsum = this.oddsum + number;
        }
    }
    public int Sum() {
        return this.sum;
    }
    public int EvenSum() {
        return this.evensum;
    }
    public int OddSum() {
        return this.oddsum;
    }
}
public class statisticspart4 {
    public static void main(String[] args) {
        statisticspart444 statistics = new statisticspart444();
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                statistics.addNumber(number);
                break;
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.Sum());
        System.out.println("Even Sum: " + statistics.EvenSum());
        System.out.println("Odd Sum: " + statistics.OddSum());
    }
}


