# @param {String[]} words
# @return {Integer}
def count_prefix_suffix_pairs(words)
    ans = 0
    words.each_with_index do |word, i|
        for k in i+1...words.length do
            if word == words[k][0,word.length] && word == words[k][-word.length..-1]
                ans += 1
            end
        end
    end
    ans
end