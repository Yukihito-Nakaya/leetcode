# @param {Integer} num
# @return {Integer}
def find_complement(num)
    l = 2
    while l <= num
        l *= 2
    end
    return l - num - 1
end