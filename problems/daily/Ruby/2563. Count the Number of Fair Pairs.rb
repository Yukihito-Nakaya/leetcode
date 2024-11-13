# @param {Integer[]} nums
# @param {Integer} lower
# @param {Integer} upper
# @return {Integer}
def count_fair_pairs(nums, lower, upper)
    nums.sort!
    # n = nums.length
    # ans = 0

    nums.each_with_index.sum do |num, i|
        lower_idx = nums.bsearch_index { |x| x >= lower - num } || nums.size
        lower_idx = i + 1 if lower_idx <= i
        upper_idx = nums.bsearch_index { |x| x > upper - num } || nums.size
        next 0 if upper_idx < lower_idx
    
        upper_idx - lower_idx
    end
    
    # (0..n).each do |i|
    #     ((i+1)...n).each do |k|
    #         math = nums[i] + nums[k]
    #         if lower <= math && math <= upper
    #             ans += 1
    #         end
    #     end
    # end
    # puts ans
    # return ans
    
end

nums =  ARGV[0].split(' ').map(&:to_i)
lower = ARGV[1].to_i
upper = ARGV[2].to_i

count_fair_pairs(nums, lower, upper)