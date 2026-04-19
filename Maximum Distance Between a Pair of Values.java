class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            for(int j=nums2.length-1;j>=i;j--){
                if(nums1[i]<=nums2[j]){
                    max=Math.max(max,j-i);
                    break;
                }
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
