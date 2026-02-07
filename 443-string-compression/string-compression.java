class Solution {
    public int compress(char[] chars) {
        //keep the original array
        int l = 0;
        int currCount = 0;
        int currPos = 0;

        for(int r = 0; r <= chars.length; r++){
            if(r == chars.length || chars[r] != chars[l]){
                currCount = r - l;
                //if(r == chars.length - 1) currCount++;
                chars[currPos] = chars[l];
                if(currCount > 1){
                    char[] count = String.valueOf(currCount).toCharArray();
                    for(int j = 0; j < count.length; j++){
                        chars[++currPos] = count[j];
                    }
                }
                currPos++;
                l = r;
            }
        }
        return currPos;
    }
}