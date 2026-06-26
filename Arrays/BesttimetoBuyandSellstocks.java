public class BesttimetoBuyandSellstocks {

    public static int buyandsellstockes(int prices[]){
        int buy_price = prices[0];
        int profit = 0;

        for(int i =1; i< prices.length; i++){
           if(prices[i] < buy_price){
            buy_price = prices[i];
           }
           else{
            int current_price = prices[i] - buy_price;
             profit = Math.max(current_price, profit);
           }
           
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstockes(prices));
    }
}
