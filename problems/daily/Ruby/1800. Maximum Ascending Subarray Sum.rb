# @param {Integer[]} nums
# @return {Integer}
def max_ascending_sum(nums)
    ans=0
    l= nums.length - 1
    i=0
    sum = nums[0]
    while i < l
        if nums[i] < nums[i+1]
            sum += nums[i+1]
        else
            ans = [ans, sum].max
            sum = nums[i+1]
        end
    end
    return [ans, sum].max
end