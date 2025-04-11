package org.example.trianglecalculator;

import java.util.Scanner;

public class TriangleSelector {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the type of triangle:");
        System.out.println("1. Equilateral Triangle");
        System.out.println("2. SSA Triangle");
        System.out.println("3. AAS Triangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        Triangle triangle;
        switch (choice) {
            case 1:
                triangle = new EquilateralTriangle();
                break;
            case 2:
                triangle = new SSATriangle();
                break;
            case 3:
                triangle = new AASTriangle();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        triangle.getInputAndCalculate();
    }
}