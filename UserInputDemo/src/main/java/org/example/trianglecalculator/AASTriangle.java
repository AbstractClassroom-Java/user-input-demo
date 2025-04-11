package org.example.trianglecalculator;

import java.util.Scanner;

class AASTriangle extends Triangle {
    @Override
    public void getInputAndCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one side length: ");
        sides[0] = scanner.nextDouble();
        System.out.print("Enter the two angles (in degrees): ");
        angles[0] = scanner.nextDouble();
        angles[1] = scanner.nextDouble();
        angles[2] = 180 - (angles[0] + angles[1]);
        area = (sides[0] * sides[0] * Math.sin(Math.toRadians(angles[0])) * Math.sin(Math.toRadians(angles[1]))) /
                (2 * Math.sin(Math.toRadians(angles[2])));
        perimeter = sides[0]; // Other sides not calculated here
        System.out.println(this);
    }
}