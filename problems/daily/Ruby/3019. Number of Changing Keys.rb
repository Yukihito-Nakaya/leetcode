# @param {String} s
# @return {Integer}
def count_key_changes(s)
    ans = 0
    i = 1
    while i < s.length
        if (s[i].capitalize!=s[i-1].capitalize)
            ans += 1
        end
        i += 1
    end
    ans
end