# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
    sp , ep = 0, nums.length - 1
    while sp <= ep
        mp = (sp + ep) / 2
        if nums[mp] == target
            return mp
        elsif nums[mp] < target
            sp = mp + 1
        else
            ep = mp - 1
        end
    end
    return -1

end