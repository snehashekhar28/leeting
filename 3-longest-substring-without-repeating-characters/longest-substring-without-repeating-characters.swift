class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        //sliding window
        var charTable: [Character: Int] = [:]
        let sArray = Array(s)
        var leftPtr = 0
        var maxLength = 0
        var length = 0

        for (rightPtr, ch) in sArray.enumerated(){
            if charTable[ch] != nil && charTable[ch]! >= leftPtr {
                leftPtr = charTable[ch]! + 1
                length = rightPtr - leftPtr
            } 
            charTable[ch] = rightPtr
            length+=1
            maxLength = max(maxLength, length)
        }
        return maxLength
    }
}
