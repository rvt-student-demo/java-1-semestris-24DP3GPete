package rvt;
import java.util.Scanner;

public class uzd232 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int summ = 0;
        int total = -1;
        int para = 0;
        int nepara = 0;

        for (int i = 0; i != -1; i = Integer.parseInt(scanner.nextLine())) {
            summ += i;
            total += 1;
            if (i % 2 == 0 && i != 0){
                para++;
            } else if (i != 0) {
                nepara++;
            }
        }
        System.err.println("Thx! Bye!");
        System.err.println("Sum: "+summ);
        System.err.println("Numbers: "+total);
        System.err.println("Average: "+(double) summ/total);
        System.err.println("Even: "+para);
        System.err.println("Odd: "+nepara);
    }

}