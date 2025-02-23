# @param {String} s
# @return {Boolean}
def has_same_digits(s)
    ans = []
    ans << s

    while ans[-1].length != 2
        res = ''
        (0...ans[-1].length - 1).each do |i|
            res += ((ans[-1][i].to_i + ans[-1][i+1].to_i)%10).to_s
        end
        ans << res
    end
    ans[-1][0] == ans[-1][1]
end