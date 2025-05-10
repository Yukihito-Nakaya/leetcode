# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer}
def min_sum(nums1, nums2)
    sum1, zero1 = nums1.sum, nums1.count(0)
    sum2, zero2 = nums2.sum, nums2.count(0)
  
    if (zero1 == 0 && sum1 < sum2 + zero2) || (zero2 == 0 && sum2 < sum1 + zero1)
      return -1
    end
  
    [sum1 + zero1, sum2 + zero2].max
  end