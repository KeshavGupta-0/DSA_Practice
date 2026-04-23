class Solution {
    public long[] distance(int[] nums) {
        long[] num=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if (nums[j]==nums[i]){
                    sum=sum+Math.abs(j-i);
                }
            }
            num[i]=sum;
        }
        return num;
    }
}
