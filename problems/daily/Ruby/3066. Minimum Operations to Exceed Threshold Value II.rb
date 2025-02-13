#Time out
# # @param {Integer[]} nums
# # @param {Integer} k
# # @return {Integer}
# def min_operations(nums, k)
#     nums.sort!
#     ans = 0
#     while nums[0] < k
#         nums[0] = nums[0] * 2 + nums[1]
#         nums.delete_at(1)
#         nums.sort!
#         ans += 1
#     end
#     return ans
# end

# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
require 'set'
def min_operations(nums, k)
    heap = Heap.new
    nums.each do |num|
        heap.push(num)
    end
    ans = 0
    while heap.peek < k
        min1 = heap.pop
        min2 = heap.pop
        heap.push(min1 * 2 + min2)
        ans += 1
    end
    return ans
end