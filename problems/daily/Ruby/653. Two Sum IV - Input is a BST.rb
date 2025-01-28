# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val = 0, left = nil, right = nil)
#         @val = val
#         @left = left
#         @right = right
#     end
# end
# @param {TreeNode} root
# @param {Integer} k
# @return {Boolean}
def find_target(root, k)
    return false if root.nil?
    hash = {}
    stack = [root]
    while !stack.empty?
        node = stack.pop
        return true if hash[k - node.val]
        hash[node.val] = true
        stack.push(node.left) if node.left
        stack.push(node.right) if node.right
    end
    return false
end