package ru.netology.stats;
public class StatsService {

    public long sum(long[] sales) {


        long ans = 0;
        for (
                long sale : sales) {
            ans += sale;
        }
        return ans;
    }

    public long average(long[] sales) {
        long sum(sales);
        return sum / 12;
    }


}
