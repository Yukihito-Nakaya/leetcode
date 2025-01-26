# @param {Integer[]} nums
# @return {Integer}
def repeated_n_times(nums)
    hash={}
    scount = 1
    ans = nums[0]
    id = 1

    while id < nums.length
        num = nums[id]
        if !nums_hash[num]
            hash[num] = 1
        else
            count = hash[num] + 1
            hash[num] = count
            if count > scount
                scount = count
                ans = num
            end
        end
        id = id + 1
    end
    ans
end