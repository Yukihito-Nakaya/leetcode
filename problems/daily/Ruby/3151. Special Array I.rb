# @param {Integer[]} nums
# @return {Boolean}
def is_array_special(nums)
    (0...nums.length-1).each do |i|
        if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i+1] % 2 != 0)
            return false
        end
    end
    return true 
end

#another solutions

def is_array_special(nums) = nums.map(&:even?).each_cons(2).all? { _1 != _2 }

