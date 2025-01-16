# @param {Integer[]} candy_type
# @return {Integer}
def distribute_candies(candy_type)
    return [candy_type.length / 2, candy_type.uniq.length].min
end