class Solution {
    public boolean isPalindrome(String s) {
        int l = 0; int r = s.length() - 1;
        while(r > l){
            while(r > l && !Character.isLetterOrDigit(s.charAt(l))){ l++; }
            while(r > l && !Character.isLetterOrDigit(s.charAt(r))){ r--; }
            if(Character.toLowerCase(s.charAt(r)) != Character.toLowerCase(s.charAt(l))) return false;
            l++;
            r--;
        }
        return true;
    }
}