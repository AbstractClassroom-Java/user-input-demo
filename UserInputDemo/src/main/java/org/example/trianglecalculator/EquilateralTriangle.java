package org.example.trianglecalculator;

import org.example.trianglecalculator.Triangle;

import java.util.Arrays;
import java.util.Scanner;

class EquilateralTriangle extends Triangle {
    @Override
    public void getInputAndCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();
        Arrays.fill(sides, side);
        Arrays.fill(angles, 60.0);
        area = (Math.sqrt(3) / 4) * side * side;
        perimeter = 3 * side;
        System.out.println(this);
    }
}