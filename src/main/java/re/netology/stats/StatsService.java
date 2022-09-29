package re.netology.stats;

public class StatsService {
    int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public int amountSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < salesAllMonth.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int midAmountSales(int[] sales) {
        int midAmount = 0;
        for (int i = 0; i < salesAllMonth.length; i++) {
            midAmount = midAmount + sales[i];
        }
        return midAmount / salesAllMonth.length;
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
        int midAmount = 0;
        int lowSales = 0;
        int month = 0;
        for (int i = 0; i < salesAllMonth.length; i++) {
            midAmount = midAmount + sales[i];
        }
        int x = midAmount / salesAllMonth.length;
        for (long sale : sales) {
            if (sale < x) {
                month = month + 1;
            }
        }
        return month;
    }

    public int countMonthsOfHighSalesFromMidAmount(int[] sales) {
        int midAmount = 0;
        int lowSales = 0;
        int month = 0;
        for (int i = 0; i < salesAllMonth.length; i++) {
            midAmount = midAmount + sales[i];
        }
        int x = midAmount / salesAllMonth.length;
        for (long sale : sales) {
            if (sale > x) {
                month = month + 1;
            }
        }
        return month;
    }

}




