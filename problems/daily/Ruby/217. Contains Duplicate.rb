# @param {Integer[]} nums
# @return {Boolean}
def contains_duplicate(nums)
    check = {}
    nums.each do |num|
        return true if check[num]
        check[num] = true
    end
    return false
end

nums =  ARGV.map(&:to_i)
puts contains_duplicate(nums)