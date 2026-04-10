class Solution {
    public int minimumDistance(int[] nums) {
        int[] a= { -1, -1, -1 };
        int curr = nums[0];
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            int count = 0;
            for (int j = i; j < nums.length && count<3; j++) {
                if (nums[j] == curr && a[0]!=j && a[1]!=j && a[2]!=j) {
                    a[count] = j;
                    count++;
                }
                if (count == 3) {
                    int cdist = Math.abs(a[0] - a[1])
                            + Math.abs(a[2] - a[1])
                            + Math.abs(a[0] - a[2]);
                    dist = Math.min(dist, cdist);
                }
            }
        }
        if (a[0] == -1 || a[1] == -1 || a[2] == -1) {
            return -1;
        }
        return dist;
    }
}
