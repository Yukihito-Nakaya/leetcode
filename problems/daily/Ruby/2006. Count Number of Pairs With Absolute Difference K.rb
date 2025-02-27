# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def count_k_difference(nums, k)
    ans = 0
    past = []
    nums.each do |num|
        ans += past.count {|i| (i-num).abs == k}
        past << num 
    end
    ans
end