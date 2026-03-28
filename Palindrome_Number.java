class Solution {
    public boolean isPalindrome(int x) {
        String Y=String.valueOf(x);
        if(Y.equals(new StringBuilder(Y).reverse().toString())){
            return true;
        }
        return false;
    }
}
