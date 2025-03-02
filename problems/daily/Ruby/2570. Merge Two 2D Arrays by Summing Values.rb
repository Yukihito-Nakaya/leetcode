# @param {Integer[][]} nums1
# @param {Integer[][]} nums2
# @return {Integer[][]}
def merge_arrays(nums1, nums2)
    ans = []
   
    while nums1.length > 0 || nums2.length > 0
        if nums1.length > 0 and  nums2.length > 0 and nums1[0][0] == nums2[0][0]
            ans << [nums1[0][0],nums1.shift[1] + nums2.shift[1]]
        elsif  nums2.length == 0 || (nums1.length > 0 and nums1[0][0] < nums2[0][0])
            ans << nums1.shift
        else
            ans << nums2.shift
        end
    end
    ans

end