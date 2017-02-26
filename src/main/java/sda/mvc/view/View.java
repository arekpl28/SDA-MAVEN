package sda.mvc.view;


import sda.mvc.controller.Controller;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Wprowadź liczbę: ");
            Integer choice = scanner.nextInt();
            Controller controller = new Controller();
            if (choice != null && choice >= 0) {
                int result = controller.getFibonacci(choice);
                System.out.println("Fibonacci= " + result);
                System.out.println();
            } else {
                System.out.println("AVG = " + controller.average());
                System.out.println();
            }
        }
    }
}
