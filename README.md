# Triangle Calculator Demo

## Overview
This project is a demonstration of how to handle user input in Java and use object-oriented programming (OOP) concepts such as inheritance and polymorphism. The program allows users to select a type of triangle, provide relevant inputs, and calculate properties such as area and perimeter.

## How User Input Works
1. **Scanner Class**: The program uses the `Scanner` class to read user input from the console.
2. **Input Prompts**: The user is prompted to enter specific values (e.g., side lengths, angles) based on the type of triangle they select.
3. **Validation**: The program assumes valid input for simplicity. In a real-world application, additional validation would be required to handle invalid or unexpected input.

### Example of User Input
- The user is asked to select a triangle type by entering a number (e.g., `1` for Equilateral Triangle).
- Based on the selection, the program prompts the user for specific inputs, such as:
  - Side lengths for an equilateral triangle.
  - Two sides and an angle for an SSA triangle.
  - One side and two angles for an AAS triangle.

## Classes and Their Responsibilities

### `Triangle` (Abstract Class)
- **Purpose**: Serves as the base class for all triangle types.
- **Fields**:
  - `sides`: An array to store the lengths of the triangle's sides.
  - `angles`: An array to store the triangle's angles in degrees.
  - `area`: Stores the calculated area of the triangle.
  - `perimeter`: Stores the calculated perimeter of the triangle.
- **Methods**:
  - `getInputAndCalculate()`: Abstract method implemented by subclasses to handle input and calculations.
  - `toString()`: Formats the triangle's properties (sides, angles, area, and perimeter) for display.

### `EquilateralTriangle`
- **Purpose**: Represents an equilateral triangle where all sides and angles are equal.
- **Input**: The user provides the length of one side.
- **Calculations**:
  - Area is calculated using the formula:  
    \[
    \text{Area} = \frac{\sqrt{3}}{4} \times \text{side}^2
    \]
  - Perimeter is calculated as:  
    \[
    \text{Perimeter} = 3 \times \text{side}
    \]

### `SSATriangle`
- **Purpose**: Represents a triangle defined by two sides and the angle between them.
- **Input**: The user provides two side lengths and the angle (in degrees) between them.
- **Calculations**:
  - Area is calculated using the formula:  
    \[
    \text{Area} = 0.5 \times a \times b \times \sin(\text{angle})
    \]
  - Perimeter is partially calculated (third side is not determined in this demo).

### `AASTriangle`
- **Purpose**: Represents a triangle defined by one side and two angles.
- **Input**: The user provides one side length and two angles (in degrees).
- **Calculations**:
  - The third angle is calculated as:  
    \[
    \text{Angle}_3 = 180 - (\text{Angle}_1 + \text{Angle}_2)
    \]
  - Area is calculated using the formula:  
    \[
    \text{Area} = \frac{\text{side}^2 \times \sin(\text{Angle}_1) \times \sin(\text{Angle}_2)}{2 \times \sin(\text{Angle}_3)}
    \]
  - Perimeter is partially calculated (other sides are not determined in this demo).

### `TriangleSelector`
- **Purpose**: Manages the user interaction and triangle selection process.
- **Responsibilities**:
  - Displays a menu for the user to select a triangle type.
  - Creates an instance of the selected triangle type.
  - Calls the `getInputAndCalculate()` method of the selected triangle to handle input and calculations.

## How to Run the Program
1. Compile the project using Maven or your preferred IDE.
2. Run the `Main` class.
3. Follow the prompts to:
   - Select a triangle type.
   - Enter the required inputs.
4. View the calculated properties of the triangle (sides, angles, area, and perimeter).

## Key Learning Points
- **User Input**: Using the `Scanner` class to read and process user input.
- **OOP Concepts**: Demonstrating inheritance, polymorphism, and abstraction.
- **Mathematical Calculations**: Applying trigonometric functions to calculate triangle properties.

This demo is designed to help students understand how to structure programs using OOP principles and handle user input effectively in Java.
