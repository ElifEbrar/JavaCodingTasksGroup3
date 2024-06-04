package Akif.week1;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = 0;
        boolean correctValue = false;

        // check value is correct
        while (!correctValue) {
            System.out.print("Please enter the number = ");
            if (scanner.hasNextInt()) {
                Number = scanner.nextInt();
                correctValue = true; // this value is correct
            } else {
                System.out.println("Invalid value! Please enter an integer.");
                scanner.next(); // Clean scanner
            }
        }

        System.out.println("Number is = " + Number);

        scanner.close();


        if (Number%2==0){
            System.out.println("Number is Even");

        }else{
            System.out.println("Number is Odd");
            return;
        }




    }
}
