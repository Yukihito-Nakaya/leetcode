# @param {String} s
# @return {Integer[][]}
def large_group_positions(s)
    c = 1
    i = 1
    ep = s[0]
    ans = []
    while i < s.length
        if s[i] != ep
            if c > 2
                ans << [i - c, i -1]
            end
            c = 1
        else
            c += 1
        end
        ep = a[i]
        i += 1
    end
    if c > 2
        ans << [i - c, i -1]
    end
    ans

end