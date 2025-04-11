package org.example.trianglecalculator;

import java.util.Scanner;

class SSATriangle extends Triangle {
    @Override
    public void getInputAndCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two sides (a, b): ");
        sides[0] = scanner.nextDouble();
        sides[1] = scanner.nextDouble();
        System.out.print("Enter the angle (in degrees) between them: ");
        angles[0] = scanner.nextDouble();
        area = 0.5 * sides[0] * sides[1] * Math.sin(Math.toRadians(angles[0]));
        perimeter = sides[0] + sides[1]; // Third side not calculated here
        System.out.println(this);
    }
}