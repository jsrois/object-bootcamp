package org.tdd;

import static org.fest.assertions.Assertions.assertThat;
import static org.tdd.Rectangle.squareWithSide;

import org.junit.Test;

public class SquareShould {
    @Test
    public void calculateArea() throws InvalidSizeException {
        assertThat(squareWithSide(10).area()).isEqualTo(100);
    }

    @Test
    public void calculatePerimeter() throws InvalidSizeException {
        assertThat(squareWithSide(10).perimeter()).isEqualTo(40);
    }

    @Test(expected = InvalidSizeException.class)
    public void notHaveNegativeSides() throws InvalidSizeException {
        assertThat(squareWithSide(-1));
    }

    @Test(expected = InvalidSizeException.class)
    public void notHaveAnyZeroValuedDimensions () throws InvalidSizeException {
        assertThat(squareWithSide(0));
    }
}
