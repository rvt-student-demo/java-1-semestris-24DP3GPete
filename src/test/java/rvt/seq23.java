package rvt;
import java.util.Scanner;

public class seq23 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pirmais skaitlis:");
        int num_f = Integer.parseInt(scanner.nextLine());
        System.out.println("Otrais skaitlis:");
        int num_l = Integer.parseInt(scanner.nextLine());
        int summ = 0;

        for (int i = num_f; i <= num_l; i++) {
            summ = summ + i;
        }
        System.out.println("The sum is "+summ);
    }

}
