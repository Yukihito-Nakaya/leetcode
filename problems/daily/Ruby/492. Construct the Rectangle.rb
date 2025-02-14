# @param {Integer} area
# @return {Integer[]}
def construct_rectangle(area)
    square = Math.sqrt(area)
    return [square.to_i, square.to_i] if square % 1 == 0
    for i in (square.to_i).downto(1)
        if area % i == 0
            return [area / i, i]
        end
    end
end