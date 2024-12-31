public class a88_buyAndSellStock {

    public static void buyAndSellStock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < price.length; i++){
            int sellPrice = price[i];
            if(sellPrice > buyPrice){
                int profit = sellPrice - buyPrice; // today's profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            else{
                buyPrice = sellPrice;
            }
        }

        System.out.println("the maximum profit is: " + maxProfit);
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        buyAndSellStock(price);
    }    
}
