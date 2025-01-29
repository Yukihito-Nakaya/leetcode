# @param {String} word
# @return {Boolean}
def detect_capital_use(word)
    word == word.upcase || word == word.downcase || word == word.capitalize
end

# another solution
def detect_capital_use(word)
    /^([A-Z]+|[A-Z]{0,1}[a-z]*)$/ === word
end