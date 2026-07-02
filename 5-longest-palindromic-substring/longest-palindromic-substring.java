class Solution {
    public String longestPalindrome(String s) {
        boolean[][] lP = new boolean[s.length()][s.length()];
        String maxS = "";
        for(int len = 1; len <= s.length(); len++){
            for(int i = 0; i <= s.length() - len; i++){
                int j = i + len - 1;
                if(j - i == 0){
                    lP[i][j] = true;
                    if(maxS.length() < j - i + 1)
                        maxS = s.substring(i,j + 1);
                }
                if(j - i == 1 && s.charAt(i) == s.charAt(j)){
                    lP[i][j] = true;
                    if(maxS.length() < j - i + 1)
                        maxS = s.substring(i,j + 1);
                }
                if(j-i >= 2 && s.charAt(i) == s.charAt(j) &&
                    lP[i+1][j-1]){
                    lP[i][j] = true;
                    if(maxS.length() < j - i + 1)
                        maxS = s.substring(i,j + 1);
                }
            }
        }
        return maxS;
        
    }
}