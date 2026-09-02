class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for (int i=0; i<k;i++){
            sum+=nums[i];
        }
        double maxsum=(double)sum/k;
        for(int i=0; i<nums.length-k;i++){
            sum=sum-nums[i]+nums[i+k];
            maxsum=Math.max(maxsum,(double)sum/k);
        }
        return maxsum;
    }
}