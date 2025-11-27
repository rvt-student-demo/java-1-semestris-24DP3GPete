package rvt;
import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    private int sumEven;
    private int sumOdd;
    
    public class MainProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Statistics statistics = new Statistics();

            // statistics.addNumber(3);
            // statistics.addNumber(5);
            // statistics.addNumber(1);
            // statistics.addNumber(2);
            // System.out.println("Count: " + statistics.getCount());
            // System.out.println("Sum: " + statistics.sum());
            // System.out.println("Average: " + statistics.average());
            
            for (int i = 0; i != -1; i = Integer.parseInt(scanner.nextLine())) {
                statistics.addNumber(i);
            }

            System.out.println("Sum: " + statistics.sum());
            System.out.println("Sum of even numbers: " + statistics.sumEven());
            System.out.println("Sum of odd numbers: " + statistics.sumOdd() + "\n");


            System.out.println("Count: " + statistics.getCount());
            System.out.println("Average: " + statistics.average());
        }
    }

    public Statistics() {
        // int count = 0;
        // int sum = 0;
        // int sumEven = 0;
        // int sumOdd = 0;
    }

    public void addNumber(int number) {
        count += 1;
        sum += number;
        if (number%2 == 0) {
            sumEven += number;
        } else {
            sumOdd += number;
        }
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double dSum = sum;
        double dCount = count;
        
        return dSum/dCount;
    }

    public int sumEven() {
        return sumEven;
    }

    public int sumOdd() {
        return sumOdd;
    }

    
}