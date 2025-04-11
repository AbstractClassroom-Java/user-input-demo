package org.example.trianglecalculator;

import java.util.Arrays;
import java.util.Collections;

abstract class Triangle {
    protected double[] sides = new double[3]; // Stores the lengths of the sides
    protected double[] angles = new double[3]; // Stores the angles in degrees
    protected double area; // Stores the area of the triangle
    protected double perimeter; // Stores the perimeter of the triangle

    public abstract void getInputAndCalculate();

    @Override
    public String toString() {
        // Sort sides and angles in descending order
        Double[] sortedSides = Arrays.stream(sides).boxed().toArray(Double[]::new);
        Double[] sortedAngles = Arrays.stream(angles).boxed().toArray(Double[]::new);
        Arrays.sort(sortedSides, Collections.reverseOrder());
        Arrays.sort(sortedAngles, Collections.reverseOrder());

        // Build the output string
        StringBuilder result = new StringBuilder();
        result.append("Sides (largest to smallest):\n");
        for (double side : sortedSides) {
            result.append("\t").append(side).append("\n");
        }

        result.append("Angles (largest to smallest):\n");
        for (double angle : sortedAngles) {
            result.append("\t").append(angle).append("\n");
        }

        result.append("Area:\t").append(area).append("\n");
        result.append("Perimeter:\t").append(perimeter).append("\n");

        return result.toString();
    }
}