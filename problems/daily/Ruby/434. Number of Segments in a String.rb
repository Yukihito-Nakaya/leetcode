# @param {String} s
# @return {Integer}
def count_segments(s)
    s.split(" ").map(&:to_s).size
    #s.strip.split(/\s+/).map(&:to_s).size
end

#another solutions
def count_segments(s)
    ans = 0
    check = false
    s.each_char do |ch|
        if ch != " " and check == false
            check = true
            ans += 1
        elsif ch == " "
            check = false
        end
    end
    ans
end