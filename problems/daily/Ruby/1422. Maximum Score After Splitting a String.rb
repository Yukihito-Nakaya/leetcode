# @param {String} s
# @return {Integer}
def max_score(s)
    ans = 0
    l = s.length
    (0...l - 1).each do |i|
        c = 0
        (0..i).each do |k|
            c += 1 if s[k] == '0'
        end
        (i + 1...l).each do |k|
            c += 1 if s[k] == '1'
        end
        ans = [ans, c].max
    end
    ans
end

#another solutions
def max_score(s)
    c = s.count('1')
    i = 0
    ans = 0
    lc = 0
  
    while i < s.size - 1
      if s[i] == '1'
        c -= 1 if c > 0
      else
        lc += 1
      end
      ans = [ans, lc + c].max
      i += 1
    end
    ans
  end