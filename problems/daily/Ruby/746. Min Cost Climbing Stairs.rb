# @param {Integer[]} cost
# @return {Integer}
def min_cost_climbing_stairs(cost)
    l = cost.length
    dp = 0
    dp1 = 0
    dp2 = 0

    for i in 2..l
        ost = dp1 + cost[i - 1]
        tst = dp2 + cost[i - 2]
        dp = [ost , tst].min
        dp2 = dp1
        dp1 = dp
    end
    return dp1
    
end

#another solutions
# @param {Integer[]} cost
# @return {Integer}

INF = 1 << 30
def min_cost_climbing_stairs(cost)
    l = cost.length
    dp = Array.new(l + 1, INF)
    dp[0] = 0
    dp[1] = 0
    (2..l).each do |i|
        dp[i] = [dp[i-1]+cost[i-1],dp[i-2] + cost[i-2]].min
    end
    
    return dp[l]
end