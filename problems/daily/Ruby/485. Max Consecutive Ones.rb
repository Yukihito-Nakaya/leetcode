# @param {Integer[]} nums
# @return {Integer}
def find_max_consecutive_ones(nums)
    ans = 0
    c = 0
    nums.each do |i|
        if i == 1
            c += 1
        else
            c = 0
        end

        if c > ans
            ans = c
        end
    end
    ans
end