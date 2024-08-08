package ru.netology.stats;

public class StatsService {
     public long sum(long [] sales) {
          long salesAmount = 0;
          for (long sale : sales) {
             salesAmount += sale;
          }
          return salesAmount;
     }

     public long average(long[] sales) {
          return sum(sales) / 12;
     }

     public int maxSales(long[] sales) {
          int month = 0;
          for (int i = 0; i < sales.length; i++) {
               if (sales[month] <= sales[i]) {
                       month = i;
               }
          }
          return month + 1;
     }

     public int minSales(long[] sales) {
          int month = 0;
          for (int i = 0; i < sales.length; i++) {
               if (sales[month] >= sales[i]) {
                    month = i;
               }
          }
          return month + 1;
     }

     public int salesBelowAverage(long[] sales) {
          int counter = 0;
          long averageSale = average(sales);
          for (long sale : sales) {
               if (sale < average(sales)) {
                    counter++;
               }
          }
          return counter;
     }

     public int aboveAverageSales(long[] sales) {
          int counter = 0;
          for (long sale : sales) {
               if (sale > average(sales)) {
                    counter++;
               }
          }
          return counter;
     }

}
