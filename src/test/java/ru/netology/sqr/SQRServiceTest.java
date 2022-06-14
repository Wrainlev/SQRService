package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void testSqlPositiveBorders() {
        SQRService sql = new SQRService();
        int minBorder = 200;
        int maxBorder = 300;
        int expected = 3;

        int result = sql.squareRoot(minBorder, maxBorder);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSqlNegativeBorders() {
        SQRService sql = new SQRService();
        int minBorder = -200;
        int maxBorder = -300;
        int expected = 0;

        int result = sql.squareRoot(minBorder, maxBorder);
        Assertions.assertEquals(expected, result);
    }
}
