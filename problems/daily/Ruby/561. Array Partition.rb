# @param {Integer[]} nums
# @return {Integer}
def array_pair_sum(nums)
    nums.sort!
    ans = 0
    nums.each_with_index do |num, i|
        next if i % 2 == 1
        ans += num
    end
    ans
end