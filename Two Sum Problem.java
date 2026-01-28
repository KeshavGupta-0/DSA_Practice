class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int i=0;
        int j=(nums.length-1);
        int[] a=new int[2];
        while (i<j && i<nums.length && j>0){
            if(nums[i]+nums[j]==target){
                for(int c=0;c<(nums.length);c++){
                    if (num[c]==nums[i]){
                        a[0]=c;
                        break;
                    }
                }
                for(int c=(nums.length-1);c>0;c--){
                    if (num[c]==nums[j]){
                        a[1]=c;
                        break;
                    }
                }
                break;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return a;
    }
}
