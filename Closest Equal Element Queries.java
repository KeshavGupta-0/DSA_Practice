class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> li=new ArrayList<>(queries.length);
        for(int i:queries){
            int j=0;
            int dist=Integer.MAX_VALUE;
            while(j<nums.length){
                if(nums[j]==nums[i] && i!=j){
                    dist=Math.min(dist,Math.min(Math.abs(j-i),nums.length-Math.abs(j-i)));
                }
                j++;
            }
            if (dist==Integer.MAX_VALUE){
                li.add(-1);
            }
            else{
                li.add(dist);
            }
        }
        return li;
    }
}
