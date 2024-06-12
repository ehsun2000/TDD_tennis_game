package org.example.tennis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticServiceTest {

    @Test
    public void test_add() {
        // Arrange
        ArithmeticService arithmeticService = new ArithmeticService();

        // Act
        int actual = arithmeticService.add(1, 2);
        int expected = 3;

        // Assert
        assertThat(actual).isEqualTo(expected);

    }

}
