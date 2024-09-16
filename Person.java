package Lession1;

import java.util.Scanner;

public class Person {

    private int id;
    private String name;
    private boolean gender;

    public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setMale(boolean value) {
        this.gender = value;
    }

    public void scanInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: ");
        while (!input.hasNextInt()) {
            System.out.println("ID must be number. Please try again:");
            input.next();
        }
        this.id = input.nextInt();

        input.nextLine();

        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter Gender (true for male, false for female): ");
        while (!input.hasNextBoolean()) {
            System.out.println("Gender must be true or false. Please try again:");
            input.next();
        }
        this.gender = input.nextBoolean();
    }


    public void printInfo() {
        System.out.println("------------------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", this.id, this.name, this.gender);
    }
}


