class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var pointer = 0
        var maxLength = 0
        let chars = Array(s) // safe integer indexing

        while pointer < chars.count {
            var length = 0
            var setChar: Set<Character> = []

            setChar.insert(chars[pointer])
            length += 1
            if maxLength < length {
                maxLength = length
            }

            var point2 = pointer
            while point2 + 1 < chars.count && setChar.insert(chars[point2 + 1]).inserted {
                length += 1
                if maxLength < length {
                    maxLength = length
                }
                point2 += 1
            } // end inner while

            pointer += 1
        } // end outer while

        return maxLength
    }
}
