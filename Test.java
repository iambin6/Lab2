package Lession2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(0, "", false);
        scanInfo(p);
        printInfo(p);
    }

    public static void scanInfo(Person p) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Gender (true for male, false for female): ");
        boolean gender = input.nextBoolean();

        p.setId(id);
        p.setName(name);
        p.setMale(gender);
    }

    public static void printInfo(Person p) {
        System.out.println("------------------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", p.getId(), p.getName(), p.isMale());
    }
}
