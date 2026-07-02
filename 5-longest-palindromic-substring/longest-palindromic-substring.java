class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int iBest = 0; int jBest = 0;
        for(int len = 1; len <= s.length(); len++){
            for(int left = 0; left <= s.length() - len; left++){
                int right = left + len - 1;
                if(len == 1){
                    dp[left][right] = true;
                }
                else if(len == 2 && s.charAt(left) == s.charAt(right)){
                    dp[left][right] = true;
                }
                else if(s.charAt(left) == s.charAt(right) && dp[left + 1][right - 1]){
                    dp[left][right] = true;
                }
                else{
                    continue;
                }

                iBest = left;
                jBest = right + 1;
                // 1 char = true (a)
                // 2 char = true (bb)
                // 3+ char = true ( //_x_ ### _x_)
            }
        }
       return s.substring(iBest, jBest);
    }
}