# @param {Integer[]} nums
# @return {Integer}
def find_min(nums)
    return find_min_recur(nums ,0, nums.length - 1)
end
#numsの中で最小の値を返す再帰関数
def find_min_recur(nums,left, right)
    #leftとrightの範囲で照準が保たれているか確認
    if nums[left] <= nums[right -1]
        #保たれている場合、最小値を返す
        return nums[left]
    end
    #保たれていない場合、中央値を求めさらに分割
    mi =(left + right) / 2

    return [find_min_recur(nums,left, mi), find_min_recur(nums,mi, right)].min
end



#another solution
def find_min(nums)
    n = nums.length
    l = 0
    r = n - 1
    while l < r
        mid = (l + r) / 2
        if nums[mid] < nums[r]
            r = mid
        else
            l = mid + 1
        end
    end
    puts nums[l]
    nums[l] 
end