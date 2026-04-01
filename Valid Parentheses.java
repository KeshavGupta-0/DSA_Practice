class Solution {
    public boolean isValid(String s) {
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            if(a<0||b<0||c<0){
                return false;
            }
            switch (s.charAt(i)){
                case '(':
                a++;
                break;
                case ')':
                a--;
                break;
                case '{':
                b++;
                break;
                case '}':
                b--;
                break;
                case '[':
                c++;
                break;
                case ']':
                c--;
                break;
                default:
                break;
            }
        }
        if(a>0||b>0||c>0){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' && s.charAt(s.length()-i-1)!=')'){
                    return false;
                }
                else if(s.charAt(i)=='[' && s.charAt(s.length()-i-1)!=']'){
                    return false;
                }
                else if(s.charAt(i)=='{' && s.charAt(s.length()-i-1)!='}'){
                    return false;
                }
            }
            return true;
        }
    }
}
