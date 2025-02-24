# @param {Integer[]} nums
# @return {Integer[]}
def get_concatenation(nums)
    return nums * 2
end

#another soltions
# @param {Integer[]} nums
# @return {Integer[]}
def get_concatenation(nums)
    ans = []
    l = nums.length
    for i in (0...l)
        ans[i] = nums[i]
        ans[i+l] = nums[i]
    end
    ans
end