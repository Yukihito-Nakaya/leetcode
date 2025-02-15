# @param {Integer} n
# @return {Integer}
def fib(n)
    n0 = 0
    n1 = 1
    return n if n < 2
    for i in (2..n)
        tent = n1
        n1 = n1 + n0
        n0 = tent
    end

    n1
end