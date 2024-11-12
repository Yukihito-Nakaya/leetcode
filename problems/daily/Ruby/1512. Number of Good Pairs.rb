# @param {Integer[]} nums
# @return {Integer}

def num_identical_pairs(nums)
    n = nums.length
    ans = 0
    (0..n).each do |i|
        ((i+1)...n).each do |k|
            if nums[i] == nums[k]
                ans += 1
            end
        end
    end

    return ans
end
##console 
nums =  ARGV.map(&:to_i)
puts num_identical_pairs(nums)