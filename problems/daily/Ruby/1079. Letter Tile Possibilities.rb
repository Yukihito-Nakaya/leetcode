# @param {String} tiles
# @return {Integer}
def num_tile_possibilities(tiles)
    ans = []
    (1..tiles.length).each do |i|
        ans += tiles.chars.permutaion(i).map(&:join)
    end
    ans.uniq.count
end
