package org.tdd;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class RectangleShould {

	@Test
	public void calculateArea() throws InvalidSizeException {
		assertThat((new Rectangle(4.2,5)).area()).isEqualTo(21);
	}

	@Test
	public void calculatePerimeter() throws InvalidSizeException {
		assertThat((new Rectangle(4, 5)).perimeter()).isEqualTo(18);
	}

	@Test(expected = InvalidSizeException.class)
	public void notHaveNegativeSides() throws InvalidSizeException {
		assertThat((new Rectangle(-4,5)));
	}

	@Test(expected = InvalidSizeException.class)
	public void notHaveAnyZeroValuedDimensions () throws InvalidSizeException {
		assertThat((new Rectangle(0,5)));
	}
}
