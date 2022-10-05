package re.netology.stats;

import java.security.Provider;

public class StatsService {

    public int amountSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int midAmountSales(int[] sales) {
        int midAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            midAmount = midAmount + sales[i];
        }
        return midAmount / sales.length;
    }

    public int monthOfMaxSales(int[] sales) {
        int maxSales = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public int monthOfMinSales(int[] sales) {
        int minSales = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minSales]) {
                minSales = month;
            }
            month = month + 1;
        }
        return minSales + 1;

    }


    public int countMonthsOfLowSalesFromMidAmount(int[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < midAmountSales(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public int countMonthsOfHighSalesFromMidAmount(int[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > midAmountSales(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

}




