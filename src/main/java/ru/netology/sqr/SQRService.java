package ru.netology.sqr;

public class SQRService {
    int totalCount = 0;

    public int squareRoot(int minBorder, int maxBorder) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder && i * i <= maxBorder) {
                totalCount++;
            }
        }
        return totalCount;
    }
}
