# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
    ans = Array.new(n+1,0)
    ans[0] = 1

    (0...n).each do |i|
        ans[i+1] += ans[i]
        if i + 2 < n +1
            ans[i+2] += ans[i]
        end
    end

    return ans[n]
end