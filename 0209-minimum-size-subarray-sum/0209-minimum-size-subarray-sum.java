class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curSum = 0;
        int curSize = 0;
        int minSize = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int flag = 0;
        
        for (right = 0; right < nums.length; right++){
            curSum += nums[right];
            curSize++;

            
            while (curSum >= target){
                flag = 1;
                minSize = Math.min(minSize, curSize);
                curSum -= nums[left];
                curSize --;
                left++;
            }
            
        }
        if (flag == 0){
            return 0;
        }
        return minSize;
    }
}