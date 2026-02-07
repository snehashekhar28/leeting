class Solution {
    public boolean isAnagram(String s, String t) {
        //sort both -> see if they are the same.
        //make hashmap to keep track of the counts of each letter
            //make an array
        
        int[] letterCounter = new int[512];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(char l: sArr){
            System.out.println(l);
            letterCounter[l]++;
        }
        for(char l: tArr){
            letterCounter[l]--;
            if(letterCounter[l] < 0) return false;
        }
        for(int l: letterCounter){
            System.out.println(l + ":" + letterCounter[l]);
            if (l != 0) return false;
        }
        return true;
    }
}