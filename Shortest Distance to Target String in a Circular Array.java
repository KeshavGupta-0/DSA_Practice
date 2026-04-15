class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dist = Integer.MAX_VALUE;
        int d;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                d = Math.abs(i - startIndex);
                d = Math.min(d, n - d);
                dist = Math.min(dist, d);
            }
        }
        if (dist == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist;
        }
    }
}
