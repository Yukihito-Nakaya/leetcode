# @param {String[]} words
# @return {String[]}
def string_matching(words)
    w = words.sort_by(&:length)
    ans =[]
    (0...w.length).each do |i|
        (i+1...w.length).each do |j|
            if w[j][w[i]]
                ans.push(w[i])
                break
            end
        end
    end
    ans
end