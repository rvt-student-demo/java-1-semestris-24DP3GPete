package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i != -1; i = Integer.parseInt(scanner.nextLine())) {
            numbers.add(i);
        }

        System.out.print("From where? ");
        int from = Integer.parseInt(scanner.nextLine());

        System.out.print("To where? ");
        int to = Integer.parseInt(scanner.nextLine());

        for (int i = from; i == to+1; i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (String i = "0"; i != ""; i = scanner.nextLine()) {
            names.add(i);
        }
        System.out.println(names.size());
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (String i = "0"; i != ""; i = scanner.nextLine()) {
            names.add(i);
        }
        System.out.print("Search for? ");
        String target = scanner.nextLine();
        if (names.contains(target)) {
            System.out.println(target + "was found!");
        } else {
            System.out.println(target + "was not found!");
        }
    }

    public static void removeLast(ArrayList<String> strings) {

       strings.remove(strings.size()-1);
    }
}
