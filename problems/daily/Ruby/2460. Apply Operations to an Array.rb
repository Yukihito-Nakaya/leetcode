# @param {Integer[]} nums
# @return {Integer[]}
def apply_operations(nums)
    l = nums.length

    (l-1).times do |i|
        if nums[i] == nums[i+1]
            nums[i] *=2
            nums[i+1] = 0
        end
    end
    ni = 0
    nums.each do |num|
        if num != 0
        nums[ni] = num
        ni += 1
        end
    end

    (ni...nums.length).each { |i| nums[i] = 0 }
    nums
end