package com.urise.noSolid;

import java.util.Scanner;

public class ProgramNoSOLID {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        System.out.println("Result: " + (a + b));
    }
}
