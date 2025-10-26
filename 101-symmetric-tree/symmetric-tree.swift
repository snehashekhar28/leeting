/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init() { self.val = 0; self.left = nil; self.right = nil; }
 *     public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
 *     public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *     }
 * }
 */
class Solution {
    func isSymmetric(_ root: TreeNode?) -> Bool {
        if root == nil {return true}
        return isMirror(root!.right, root!.left)
    }

    func isMirror(_ right: TreeNode?,_ left: TreeNode?) -> Bool {
        if left == nil && right == nil {return true}
        if left == nil || right == nil {return false}
        
        return left!.val == right!.val && isMirror(right!.left, left!.right) && isMirror(right!.right, left!.left)
    }
}