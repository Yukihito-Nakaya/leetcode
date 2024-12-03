# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Float}

def find_median_sorted_arrays(nums1, nums2)
    n = nums1.length
    m = nums2.length
    # n < m になるようにする
    if n > m
        n,m = m,n
        nums1,nums2 = nums2,nums1
    end
    
    is_odd = ((n + m) & 1) == 1
    half = (n + m) / 2

    #値の小さい方にnums1の要素をいくつ入れるか
    #前提
    if n == 0
        if is_odd
            return nums2[m/2]
        # m >= 2
        else
            return (nums2[m/2] + nums2[m/2]) / 2
        end
    end
    
    if is_odd
        if nums2[(n + m) / 2] <= nums1[0]
            return nums2[(n + m) / 2]
        end
    else
        if m > n and nums2[(n+m)/2] <= nums1[0]
            return (nums2[(m+n)/2] + nums2[(m+n)/2 - 1]) / 2
        end
    end

    def odd_med(nums1, nums2, i, j)
        val1 = nums1[i] if i >= 0
        val2 = nums2[j] if j >= 0
        return [val1, val2].compact.max
    end

    def even_med(nums1, nums2, i, j)
        mv = [nums1[i],nums2[j]].max
        if i > 0 and j > 0
            if mv == nums1[i]
                return (mv + [nums1[i-1],nums2[j]].max) / 2
            else
                return (mv + [nums1[i],nums2[j-1]].max) / 2
            end
        elsif i > 0
            if mv == nums1[i]
                return (mv + [nums1[i-1] + nums2[j]].max) / 2
            else
                return (nums1[i] + nums2[j]) / 2
            end
        elsif j > 0
            if mv == nums1[i]
                return (nums1[i] + nums2[j]) / 2
            else
                return (mv + [nums1[i],nums2[j-1]].max) / 2
            end
        else
            return (nums1[i] + nums2[j]) / 2
        end
    end

    def med(nums1, nums2, is_odd,i, j)
        if is_odd
            return odd_med(nums1, nums2, i, j)
        else
            return even_med(nums1, nums2, i, j)
        end
    end

    def check(nums1, nums2, i, n, m, half, is_odd)
        j = half - i - 1
        if i + 1 < n and j + 1 < m
            if nums1[i] <= nums2[j+1] and nums2[j] <= nums1[i+1]
                return true, med(nums1, nums2, i, j, is_odd)
            elsif nums1[i] <= nums2[j+1]
                return false, 1
            elsif nums2[j] <= nums1[i+1]
                return false, -1
            end

        elsif i + 1 < n
            if nums2[j] <= nums1[i + 1]
                return true, med(nums1, nums2, i, j, is_odd)
            else
                return false, 1
            end

        elsif j + 1 < m
            if nums1[i] <= nums2[j + 1]
                return true, med(nums1, nums2, i, j, is_odd)
            else
                return false, -1
            end
        else
            return true, med(nums1, nums2, i, j, is_odd)
        end
    end

    low,high = 0,n-1

    while true
        mid = (low + high) / 2
        find_med, val = check(nums1, nums2, mid, n, m, half, is_odd)
        if find_med
            return val
        elsif val == -1
            high = mid - 1
        else
            low = mid + 1
        end
    end

end

#another solution
def find_median_sorted_arrays(nums1, nums2)

    return get_median(nums1)  if nums2.empty?

    return get_median(nums2) if nums1.empty?
    
    arr =  join_arrs(nums1, nums2)
    get_median(arr)

end


def join_arrs(arr1, arr2)
    part1, unpatched1, unpatched2 = [], [], []
    n1_greater = arr1.bsearch_index{|x| x > arr2[0] }
    
    part1.concat(arr1[0...n1_greater])
    if n1_greater  
        unpatched1 = arr1[n1_greater..]
        n2_greater = arr2.bsearch_index{ |x| x > unpatched1[0]}

       if n2_greater 
        part1.concat(arr2[0...n2_greater])
         unpatched2 = arr2[n2_greater..] 
         return part1.concat(join_arrs(unpatched1, unpatched2))
       else
        return part1.concat(arr2).concat(unpatched1)
       end

    else
        return part1.concat(arr2)
    end

    
end

def get_median(arr)
    len = arr.size
    return arr[0].to_f unless len > 1
    midpoint = len /2 

    if (len % 2) == 0 
        sum = (arr[midpoint]+arr[midpoint-1])
        (sum.to_f/2).round(4)
    else 
        arr[midpoint].to_f
    end
end