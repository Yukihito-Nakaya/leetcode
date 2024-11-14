# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    # n = nums.length
    # ans = Array.new(2,0)
    ans = {}
    nums.each_with_index do |num,i|
        if ans.key?(target - num)
            puts [ans[target - num],i]
            return [ans[target - num],i]
        end
        ans[num] = i
    end
    puts []
    []
    # (0..n).each do |i|
    #     ((i+1)...n).each do |k|
    #         if nums[i] + nums[k] == target
    #             ans[0] = i
    #             ans[1] = k
    #         end
    #     end
    # end
    # return ans
end

nums =  ARGV[0].split(' ').map(&:to_i)
target = ARGV[1].to_i

two_sum(nums, target)