# @param {Integer[]} nums
# @return {Integer}
def longest_monotonic_subarray(nums)
    nums.each_cons(2).inject([1] * 3) do |(i, d, m), (n1, n2)|
        n1 < n2 ? [i += 1, 1, [i, d, m].max] :       
        n1 > n2 ? [1, d += 1, [i, d, m].max] : 
        [1, 1, m]
    end.last
end