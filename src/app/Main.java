package app;

public class Main {
    static int daySalesCount;
    static int productNumber;
    static String productName;
    static double totalSalesPrice;
    static double daySalesPrice;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        daySalesCount = 5;
        productNumber = 1;
        productName = "smartphone";
        totalSalesPrice = 12153.41;
        daySalesPrice = totalSalesPrice / daySalesCount;

        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is %s %.2f,\n" +
                "sales by day is %s %.2f.\n", productNumber,productName,daySalesCount,CURRENCY,totalSalesPrice,CURRENCY,daySalesPrice);

        daySalesCount = 7;
        productNumber = 2;
        productName = "laptop";
        totalSalesPrice = 10486.85;
        daySalesPrice = totalSalesPrice / daySalesCount;

        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is %s %.2f,\n" +
                "sales by day is %s %.2f.\n", productNumber,productName,daySalesCount,CURRENCY,totalSalesPrice,CURRENCY,daySalesPrice);
    }
}