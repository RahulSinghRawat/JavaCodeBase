package Problems;

/* Best time to sell or buy stocks
design an algorithm to find the maximum profit.*/
public class MaxStockProfitSet1 {

	public static void main(String[] args) {
		
	//	int [] prices = {7,6,4,3,1}; // output would be 0 as all are in descending order.
		int [] prices = {9,1,5,3,2};
		MaxStockProfitSet1 maxStockProfitSet1 = new MaxStockProfitSet1();
		System.out.println(maxStockProfitSet1.maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		int minIth = 0;
		int maxIth = 0;
		for(int i = 0;i < prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
			//	minIth = i;
			} else {
				max = Math.max(max, prices[i] - min);
				/*if(prices[i] - min >= max)
				maxIth = i;*/
			}
			
		}
		
		System.out.println("Buy stock on day "+minIth+" and sell on day "+maxIth );
		return max;
	}

}

