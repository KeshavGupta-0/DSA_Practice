class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                int a=prices[i]-prices[j];
                if (a>ans){
                    ans=a;
            }
        }
        }
        return ans;
    }
}
