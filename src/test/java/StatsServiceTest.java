import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import re.netology.stats.StatsService;

public class StatsServiceTest {
    @Test

    public void amountSalesOfAllMonth() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountSales(salesAllMonth);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test

    public void midAmountSalesOfAllMonth() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMidAmount = 15;
        int actualMidAmount = service.midAmountSales(salesAllMonth);

        Assertions.assertEquals(expectedMidAmount, actualMidAmount);
    }

    @Test

    public void monthMaxSales() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMaxSales = 8;
        int actualMonthMaxSales = service.monthOfMaxSales(salesAllMonth);

        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    @Test

    public void monthMinSales() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMinSales = 9;
        int actualMonthMinSales = service.monthOfMinSales(salesAllMonth);

        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);
    }

    @Test

    public void countMonthOfLowSalesFromMidAmount() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedWith = 5;
        int actualWith = service.countMonthsOfLowSalesFromMidAmount(salesAllMonth);

        Assertions.assertEquals(expectedWith, actualWith);
    }

    @Test

    public void countMonthOfHighSalesFromMidAmount() {
        StatsService service = new StatsService();

        int[] salesAllMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedWith = 5;
        int actualWith = service.countMonthsOfHighSalesFromMidAmount(salesAllMonth);

        Assertions.assertEquals(expectedWith, actualWith);
    }
}
