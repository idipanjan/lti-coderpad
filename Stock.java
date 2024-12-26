package coderpad;

import java.util.*;

public class Stock {
    public static String[] getTopStocks(String[] stocks, float[][] prices) {
        // Map to store the stock names and their average prices
        Map<String, Float> stockAverages = new HashMap<>();


        // Calculate the average price for each stock
        for(int i=0; i<stocks.length; i++){
            float total = 0;
            int days = prices.length;
            for( int j=0; j<days; j++){
                total += prices[j][i];
            }
            float average = total / days;
            stockAverages.put(stocks[i], average);
        }
        // Sort stocks by their average prices in descending order
        List<Map.Entry<String, Float>> sortedStocks = new ArrayList<>(stockAverages.entrySet());
        sortedStocks.sort((a, b) -> Float.compare(b.getValue(), a.getValue()));

        // Get the top 3 stocks
        String[] topStocks = new String[3];
        for (int i = 0; i < 3; i++) {
            topStocks[i] = sortedStocks.get(i).getKey();
        }

        return topStocks;
    }

    public static void main(String[] args){
        String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
        float[][] prices = {
                {12.81f, 11.09f, 12.11f, 10.93f, 9.83f, 8.14f},
                {10.34f, 10.56f, 10.14f, 12.17f, 9.45f, 8.73f},
                {11.22f, 10.76f, 11.02f, 11.67f, 9.64f, 8.43f}
        };

        // Get the top 3 stocks
        String[] topStocks = getTopStocks(stocks, prices);
        System.out.println(Arrays.toString(topStocks));
    }
}
