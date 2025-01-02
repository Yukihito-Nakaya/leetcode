# @param {Integer} n
# @return {Boolean}
def is_happy(n)
    check = 0
    loop do
        while n > 0
            tent = n % 10
            check += tent * tent
            n /= 10
        end
        return true if check == 1
        return false if check == 4

        n = check
        check = 0
    end
end