# @param {Integer[][]} mat
# @param {Integer} k
# @return {Integer[]}
def k_weakest_rows(mat, k)
    mat.each_with_index.map { |row, i| [row.sum, i] }.sort_by { |a, b| a }.take(k).map { |a, b| b }
end