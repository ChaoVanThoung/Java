package basic;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declare variable
        String name ;
        String gender;
        int age;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your gender: ");
        gender = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("***********< Person Information >***********");
        System.out.println("Your name is " + name);
        System.out.println("Your gender is " + gender);
        System.out.println("Your age is " + age);





    }
}
