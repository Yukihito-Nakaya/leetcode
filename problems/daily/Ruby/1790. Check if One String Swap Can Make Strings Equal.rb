# @param {String} s1
# @param {String} s2
# @return {Boolean}
def are_almost_equal(s1, s2)
    s2 = s2.chars
    s2.each_with_index do |char1, i|
      s2.each_with_index do |char2, j|
        s2[i], s2[j] = s2[j], s2[i]
        return true if s2.join == s1
        s2[i], s2[j] = s2[j], s2[i]
      end
    end
    false 
end