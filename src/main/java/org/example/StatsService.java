package org.example;

public class StatsService {

    public long totalAmount(long[] sales) {
        long amount = 0;

        for (long i = 0; sales.length > i; i++) {
            amount += sales[(int)i];
        }
        return amount;

    }

    public long averageAmount(long[] sales) {
        long average = 0;
        long amount = 0;

        for (long i = 0; sales.length > i; i++) {
            amount = amount + sales[(int)i];
            average = amount / sales.length;
        }
        return average;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long belowAverageSales(long[] sales) {
        long monthBelowAverage = 0;
        long average = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthBelowAverage += 1;
            }
        }
        return monthBelowAverage;

    }
    public long aboveAverageSales(long[] sales) {
        long monthAboveAverage = 0;
        long average = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthAboveAverage += 1;
            }
        }
        return monthAboveAverage;

    }

}

