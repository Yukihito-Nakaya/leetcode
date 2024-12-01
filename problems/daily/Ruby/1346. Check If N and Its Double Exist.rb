# @param {Integer[]} arr
# @return {Boolean}
def check_if_exist(arr)
    hash = {}
    arr.each do |i|
        return true if hash[i * 2]
        return true if 0 == (i/2.to_f) % 1 && hash[(i/2.to_f).to_i]
        hash[i] = true
    end
    false
end