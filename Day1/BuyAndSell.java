package Day1;

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        int ans=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            ans=Math.max(ans,prices[i]-min);
           }
        return ans;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
