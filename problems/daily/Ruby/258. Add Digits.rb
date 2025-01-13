# @param {Integer} num
# @return {Integer}
def add_digits(num)
    while num >= 10
        num = num.to_s.chars.map(&:to_i).sum
    end
    num
end