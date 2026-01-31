class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
