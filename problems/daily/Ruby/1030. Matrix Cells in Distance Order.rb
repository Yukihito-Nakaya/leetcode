# @param {Integer} rows
# @param {Integer} cols
# @param {Integer} r_center
# @param {Integer} c_center
# @return {Integer[][]}
def all_cells_dist_order(rows, cols, r_center, c_center)
    ans = []
    (0...rows).each do |r|
        (0...cols).each do |c|
            ans << [r, c]
        end
    end
    ans.sort_by{|r, c| (r - r_center).abs + (c - c_center).abs}
end