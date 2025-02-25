# @param {Integer[]} arr
# @return {Integer}
def num_of_subarrays(arr)
    ans = 0
    odd = 0
    even = 1
    sum = 0
    arr.each do |num|
        sum += num
        if sum % 2 == 0
            ans += odd
            even += 1
        else
            ans += even
            odd += 1
        end
    end
    ans % (10**9 + 7)
end

#another soltions
# @param {Integer[]} arr
# @return {Integer}
def num_of_subarrays(arr)
    mod = 10**9 + 7
    ans = 0
    count = [1, 0]
    sum = 0
    arr.each do |num|
        sum += num
        ans += count[sum % 2 ^ 1]
        count[sum % 2] += 1

        # sum += num
        # if sum & 1 == 0
        #   ans = (ans + count[1]) % mod
        #   count[0] += 1
        # else
        #   ans = (ans + count[0]) % mod
        #   count[1] += 1
        # end
    end
    ans % mod
    # ans
end

