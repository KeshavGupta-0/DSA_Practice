class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            int lo=i,hi=nums2.length-1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums2[mid] >= nums1[i]) {
                    max = Math.max(max, mid - i);
                    lo = mid + 1;
                } 
                else {
                    hi = mid - 1;
                }
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
