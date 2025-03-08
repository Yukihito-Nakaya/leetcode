# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def sum_of_good_numbers(nums, k)
    ans = 0
    nums.each_with_index do |num, i|
        next if i - k >= 0 && num <= nums[i-k]
        next if i + k < nums.length && num <= nums[i+k]
        ans += num
    end
    ans
end