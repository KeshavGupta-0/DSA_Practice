class Solution {
    public int mySqrt(int x) {
        int i;
        for(i=1;i<=x/2 && x/i>i;i++){
        }
        if(x/i==i){
            return i;
        }
        else if(x==0){
            return 0;
        }
        return i-1;        
    }
}
