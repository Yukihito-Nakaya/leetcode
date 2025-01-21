# @param {Integer} n
# @return {Boolean}
def is_power_of_three(n)
    return false if n <= 0
    3 ** (Math.log(n+1)/Math.log(3)).to_i == n
end