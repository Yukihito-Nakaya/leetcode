# @param {String} s
# @return {String}
def clear_digits(s)
    ans = ""
    s.each_char do |c|
        # if c >= '0' && c <= '9'
        if c =~ /[0-9]/ # 正则表达式
            if ans.length > 0
                ans = ans[0..-2]
            end
        else
            ans += c
        end
    end
    ans
end