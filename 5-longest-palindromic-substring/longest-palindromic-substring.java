class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        String bestS = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String temp = s.substring(i,j);
                if(len<(j-i) && isPalindrome(temp)){
                    len = Math.max(len, j-i);
                    bestS = temp;
                }
            }
        }
        return bestS;
    }

    boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while(r >= l){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            } else return false;
        } return true;
    }
}

