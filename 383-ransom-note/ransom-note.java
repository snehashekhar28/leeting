class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] repository = new int[26];
        char[] magTracker = magazine.toCharArray();
        char[] ranTracker = ransomNote.toCharArray();
        for(int i = 0; i < magTracker.length; i++){
            repository[magTracker[i] - 'a']++;
        }
        for(int i = 0; i < ranTracker.length; i++){
            repository[ranTracker[i] - 'a']--;
            if(repository[ranTracker[i] - 'a'] < 0) return false;
        }
        return true;
    }
}