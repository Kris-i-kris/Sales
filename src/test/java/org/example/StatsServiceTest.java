package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalAmountForYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.totalAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountForMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //long [] expected = {6, 8};
        //long [] actual = {service.maxSales(sales)};

        //System.out.println(Arrays.toString(expectedAmount));
        // System.out.println(Arrays.toString(actualAmount));
        // Assertions.assertEquals(actualAmount, actualAmount);
        // }
        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void SalesBelowAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SalesAboveAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }


}
