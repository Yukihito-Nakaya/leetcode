/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int max = peakIndex(mountainArr);
        int bS = binarySearch(mountainArr,target,0,max);
        if(bS != -1){
            return bS;
        }
        return binarySearch(mountainArr,target,max + 1, mountainArr.length() - 1);
    }

    public static int peakIndex(MountainArray mountainArr){
        int sp = 0;
        int ep =  mountainArr.length() - 1;
        while(sp < ep){
            int mp = sp + (ep - sp)/2;
            if(mountainArr.get(mp) > mountainArr.get(mp + 1)){
                ep = mp;
            }else {
                sp = mp + 1;
            }
        }
        return sp;
    }

    public static int binarySearch(MountainArray mountainArr, int target, int sp ,int ep){
        boolean chk = mountainArr.get(sp) < mountainArr.get(ep);
        while(sp <= ep){
            int mp = sp + (ep - sp)/2;
            if(target == mountainArr.get(mp)){
                return mp;
            }
            if(chk){
                if(target > mountainArr.get(mp)){
                    sp = mp + 1;
                }else{
                    ep = mp - 1;
                }
            }else{
                if(target > mountainArr.get(mp)){
                    ep = mp - 1;
                }else{
                    sp = mp + 1;
                }
            }
        }
        return -1;
    }
}