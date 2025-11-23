# @param {Integer[]} nums
# @return {Integer}
def max_sum_div_three(nums)
    # dp[i] = 余りがiの時の最大和
    # dp[0] = 余りが0の最大和, dp[1] = 余りが1の最大和, dp[2] = 余りが2の最大和
    dp = [0, -Float::INFINITY, -Float::INFINITY]
    
    nums.each do |num|
        # 現在のdpの状態をコピー（更新前の状態を保持）
        temp = dp.dup
        
        # 各余りの状態を更新
        (0..2).each do |i|
            # 現在の数値を追加した場合の新しい余り
            new_remainder = (i + num) % 3
            # より大きな和があれば更新
            dp[new_remainder] = [dp[new_remainder], temp[i] + num].max
        end
    end
    
    # 余りが0の場合の最大和を返す（負の値なら0）
    dp[0] > 0 ? dp[0] : 0
end

# テストケース
puts "Test case 1: [3,6,5,1,8]"
result1 = max_sum_div_three([3,6,5,1,8])
puts "Result: #{result1}"

puts "\nTest case 2: [4]"
result2 = max_sum_div_three([4])
puts "Result: #{result2}"

puts "\nTest case 3: [1,2,3,4,4]"
result3 = max_sum_div_three([1,2,3,4,4])
puts "Result: #{result3}"