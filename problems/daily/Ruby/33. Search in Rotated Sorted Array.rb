# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
    nums.each_with_index do |num, index|
        return index if num == target
    end
    return -1
end


#another solution
def search(nums, target)
    sp = 0
    ep = nums.length() -1

    while sp <= ep
        mid = (sp + ep) / 2
        return mid if nums[mid] == target

        if nums[sp] <= nums[mid]
            if nums[sp] <= target && target < nums[mid]
                ep = mid - 1
            else
                sp = mid + 1
            end
        else
            if nums[mid] < target && target <= nums[ep]
                sp = mid + 1
            else
                ep = mid - 1
            end
        end
    end
    return -1
end