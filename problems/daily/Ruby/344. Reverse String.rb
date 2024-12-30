# @param {Character[]} s
# @return {Void} Do not return anything, modify s in-place instead.
def reverse_string(s)
    lp = 0
    rp = s.length - 1

    while lp < rp
        temp = s[rp]
        s[rp] = s[lp]
        s[lp] = temp
        rp -= 1
        lp += 1
    end
    s
end

# @param {Character[]} s
# @return {Void} Do not return anything, modify s in-place instead.
def reverse_string(s)
    s.reverse!
end