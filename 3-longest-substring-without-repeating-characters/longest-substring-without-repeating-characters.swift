class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        //sliding window
        var charTable: [Character: Int] = [:]
        let sArray = Array(s)
        var leftPtr = 0
        var maxLength = 0

        for (rightPtr, ch) in sArray.enumerated(){
            if charTable[ch] != nil && charTable[ch]! >= leftPtr {
                leftPtr = charTable[ch]! + 1
            } 
            charTable[ch] = rightPtr
            maxLength = max(maxLength, rightPtr - leftPtr + 1)
        }
        return maxLength
    }
}
