# @param {Integer[]} nums
# @return {Integer}
def find_lhs(nums)
    ans = 0
    hash = {}

    nums.each do |num|
        if hash[num]
            hash[num] += 1
        else
            hash[num] = 1
        end
    end

    hash.each do |key, value|
        if hash[key+1]
            ans = [ans, value + hash[key+1]].max
        end
    end

    ans
    
end