# @param {String[]} words
# @return {String[]}
def find_words(words)
    rows = ["qwertyuiop","asdfghjkl","zxcvbnm"]
    ans = []
    while ch = rows.pop
        ans.concat(words.select{|w|w.downcase.tr(ch,"").empty?})
    end
    ans
end

