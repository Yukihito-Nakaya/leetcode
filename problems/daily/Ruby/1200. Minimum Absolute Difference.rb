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
<<<<<<< HEAD
            ans << p
        end
    end
    ans
end


# @param {Integer[]} arr
# @return {Integer[][]}
def minimum_abs_difference(arr)
    res = []
    arr.sort!
    min = Float::INFINITY
    (0..arr.length-2).each do |i|
        diff  = arr[i + 1] - arr[i]
        if diff < min
            ans = [[arr[i],arr[i+1]]]
            min = diff
        elsif diff == min
            ans << [arr[i],arr[i+1]]
        end
    end
    ans
=======
            ans << pair
        end
    end
>>>>>>> 00818684cd52544b94c9a7981012302b52a1acca
end