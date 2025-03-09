# @param {Integer[]} nums
# @return {Boolean}
def can_alice_win(nums)
    sdigits = wdigits = 0
    nums.each do |n|
        if n < 10
            sdigits += n
        else
            wdigits += n
        end
    end
    sdigits != wdigits

    ##nums.partition { _1 < 10 }.map(&:sum).reduce(:!=)
end