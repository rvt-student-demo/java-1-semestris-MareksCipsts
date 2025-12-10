package rvt;

public class statistics {
    private int count;

    public statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}

class MainProgram {
    public static void main(String[] args) {
        statistics statistics = new statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
