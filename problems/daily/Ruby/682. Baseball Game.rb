# @param {String[]} operations
# @return {Integer}
def cal_points(operations)
    ans = []
    operations.each do |ch|
        case ch
        when "C"
            ans.pop
        when "D"
            ans << ans.last * 2
        when "+"
            ans << ans[-1] + ans[-2]
        else
            ans << ch.to_i
        end
    end
    ans.sum
end