# @param {Integer[]} nums
# @return {Integer}
def subarray_sum(nums)
    ans = 0
    l = nums.length
    (0...l).each do |i|
        sp = [0,i - nums[i]].max
        (sp..i).each do |k|
            ans += nums[k]
        end
    end
    ans
end