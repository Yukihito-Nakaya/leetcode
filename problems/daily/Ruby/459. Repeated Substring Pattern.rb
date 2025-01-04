# @param {String} s
# @return {Boolean}
def repeated_substring_pattern(s)
    str = ""
    l = s.length
    for i in (0...l/2)
        ch = s[i]
        str += ch
        return true if str*(l/(i+1)) == s
    end
    return false
end