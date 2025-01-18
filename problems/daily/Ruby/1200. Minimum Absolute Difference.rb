# @param {Integer[]} arr
# @return {Integer[][]}
def minimum_abs_difference(arr)
    arr.sort!
    min = arr.max
    ans = []
    arr.each_cons(2) do |p|
        diff = p[1]-p[0]
        if diff <= min
            ans.clear unless diff == min
            min == diff
            ans << pair
        end
    end
end