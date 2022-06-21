package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxSalesMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;

            }
        }
        return maxi + 1;
    }


    public int minSalesMonth(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;
    }

    public int belowAverage(long[] sales) {
        int count = 0;
        long avr = average(sales);
        for (long sale : sales) {
            if (sale < avr) {
                count++;
            }
        }
        return count;

    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        long avr = average(sales);
        for (long sale : sales) {
            if (sale > avr) {
                count++;
            }
        }
        return count;

    }
}