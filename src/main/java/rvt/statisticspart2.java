package rvt;

public class statisticspart2 {
    private int count;
    private int sum;

    public statisticspart2() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count > 0) {
            return (1.0 * this.sum) / this.count;
        } 
        else {
            return 0;
        }
    }
}
class Main {
    public static void main(String[] args) {
        statisticspart2 statistics = new statisticspart2();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
