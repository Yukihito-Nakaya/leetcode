class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int l = profit.length;
        Job[] jobs = new Job[l];
        for(int i = 0; i < l; i++){
            jobs[i] = new Job(endTime[i], startTime[i],  profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));
        int[] dp = new int[l + 1];
        for(int i = 0; i < l; i++){
            int endValue = jobs[i].endTime;
            int startValue = jobs[i].startTime;
            int profitValue = jobs[i].profit;
            int index = binarySearch(jobs, i,startValue);
            dp[i + 1] = Math.max(dp[i], dp[index] + profitValue);
        }
        return dp[l];
    }
    private int binarySearch(Job[] jobs, int end, int startValue){
        int l = 0;
        int h = end;
        while(l < h){
            int mid = (h + l) / 2;
            if(jobs[mid].endTime <= startValue){
                l = mid + 1;
            }else{
                h = mid;
            }
        }
        return l;
    }

    private static class Job{
        int startTime;
        int endTime;
        int profit;
        public Job(int endTime, int startTime,  int profit){
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }
}