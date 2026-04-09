class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)){ 
            return true;
        }
        else if(word.toLowerCase().equals(word)){ 
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0)) && 
                word.substring(1).toLowerCase().equals(word.substring(1))){  
            return true;
        }
        return false;
    }
}
