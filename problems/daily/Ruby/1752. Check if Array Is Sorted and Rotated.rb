# @param {Integer[]} nums
# @return {Boolean}
def check(nums)
    c = 0
    (1...nums.length).each do |i|
        c +=1 if  nums[i] < nums[i-1]
    end
    return true if c == 0
    return true if c == 1 and nums[0] >= nums[-1]
    false
end