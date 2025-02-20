# @param {Integer[][]} mat
# @param {Integer} r
# @param {Integer} c
# @return {Integer[][]}
def matrix_reshape(mat, r, c)
    ans = mat.flatten
    return mat if r*c != ans.length
    ans.each_slice(c).to_a
end