# @param {Integer[]} nums
# @return {String[]}
def summary_ranges(nums)
    nums.chunk_while{ |a,b| a + 1 == b}.map{ |x| [x.first,x.last].uniq.join("->")}
end