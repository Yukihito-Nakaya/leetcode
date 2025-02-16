# @param {Integer[]} nums
# @return {Integer[]}
def smaller_numbers_than_current(nums)
    sorted = nums.sort
    hash = Hash.new
    sorted.each_with_index do |num,i|
        next if hash[num]
        hash[num] = i
    end
    nums.each_with_index do |num,i|
        nums[i] = hash[num]
    end
    nums
end