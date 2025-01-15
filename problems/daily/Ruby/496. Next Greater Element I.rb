# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def next_greater_element(nums1, nums2)
    nums1.map do |n|
        idx = nums2.find_index(n)
        nums2[idx..-1].find{|i| i > n} || -1
    end
end