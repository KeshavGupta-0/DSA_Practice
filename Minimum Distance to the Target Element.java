class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start]==target){
            return 0;
        }
        int a=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(start-i)<=a && nums[i]==target){
                a=Math.abs(start-i);
            }
        }
        return a;
    }
}
