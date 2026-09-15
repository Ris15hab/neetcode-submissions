class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int lowest = Integer.MAX_VALUE;
        for(int price: prices){
            lowest = Math.min(lowest,price);
            maxPro = Math.max(maxPro,price-lowest);
        }
        return maxPro;
    }
}
