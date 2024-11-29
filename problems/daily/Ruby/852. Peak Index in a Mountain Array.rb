# @param {Integer[]} arr
# @return {Integer}
def peak_index_in_mountain_array(arr)
    sp = 0
    ep = arr.length() - 1
    while sp < ep
        mid = (sp + ep) / 2
        if arr[mid] < arr[mid + 1]
            sp = mid + 1
        else
            ep = mid
        end
    end
    return sp
end 