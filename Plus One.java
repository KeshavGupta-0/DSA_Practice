class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        digits[i]++;
        for(i=digits.length-1;i>0;i--){
            if (digits[i]>=10){
                digits[i]=digits[i]%10;
                digits[i-1]++;
            }
        }
        if(digits[0]==10){
            int[] digit=new int[digits.length+1];
            digit[0]=1;
            digit[1]=0;
            for(int j=2;j<digit.length;j++){
                digit[j]=digit[j-2];
            }
            return digit;   
        }
        return digits;
    }
}
