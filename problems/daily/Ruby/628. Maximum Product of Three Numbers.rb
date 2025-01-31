# @param {Integer[]} nums
# @return {Integer}
def maximum_product(nums)
    ans = nums.sort
    return [ans[0] * ans[1] * ans[-1], ans[-1] * ans[-2] * ans[-3]].max
end
#another solution
# @param {Integer[]} nums
# @return {Integer}
def maximum_product(nums)
    nums = nums.sort
    return [nums.last * nums[0] * nums[1] , nums.last(3).reduce(:*)].max
end