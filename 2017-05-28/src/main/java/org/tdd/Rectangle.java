package org.tdd;

public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws InvalidSizeException {

        if (width <= 0 || height <= 0) {
            throw new InvalidSizeException();
        }
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }


    public double perimeter() {
        return 2 * (width + height);
    }


    public static Rectangle squareWithSide(double side) throws InvalidSizeException {
        return new Rectangle(side, side);
    }
}
