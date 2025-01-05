# @param {String} s
# @param {Integer} k
# @return {String}
def license_key_formatting(s, k)
    s.upcase.delete("-").reverse.scan(/.{1,#{k}}/).join("-").reverse
end