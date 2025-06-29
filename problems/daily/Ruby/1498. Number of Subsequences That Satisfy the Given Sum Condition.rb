# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def num_subseq(nums, target)
    nums.sort!
    mod = 10**9 + 7
    left, right = 0, nums.length - 1
    ans = 0
    power = Array.new(nums.length, 1)
    
    # Precompute powers of 2
    (1...nums.length).each do |i|
        power[i] = (power[i - 1] * 2) % mod
    end
    
    while left <= right
        if nums[left] + nums[right] <= target
        ans = (ans + power[right - left]) % mod
        left += 1
        else
        right -= 1
        end
    end
    
    ans
    
end