# @param {Integer[]} nums
# @return {Integer}
def tuple_same_product(nums)
    h = Hash.new(0)
    c = 0
    (nums.size-1).times do |i|
      (i+1...nums.size).to_a.each do |j|
        prod = nums[i] * nums[j]
        c += h[prod] if h[prod] != 0
        h[prod] += 1
      end
    end
    c * 8
end