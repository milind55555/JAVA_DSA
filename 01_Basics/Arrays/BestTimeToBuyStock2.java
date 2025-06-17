public class BestTimeToBuyStock2 {
    public static void main(String[] args) {
       int[] nums={7,1,3,4,5};
       System.out.println(maxProfit(nums)); 
    }
    public static int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i=0;i < prices.length;i++){
            if( i < prices.length-1 && prices[i] < prices[i+1]){
                max_profit += prices[i+1]-prices[i];
            }
        }
        return max_profit;
    }
}
