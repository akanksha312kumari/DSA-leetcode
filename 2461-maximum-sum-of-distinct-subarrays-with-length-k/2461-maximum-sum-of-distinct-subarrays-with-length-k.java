class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        long curSum = 0;
        long maxSum = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            while(s.contains(nums[right]) || s.size()==k){
                curSum -= nums[left];
                s.remove(nums[left]);
                left++;
            }

            curSum += nums[right];
            s.add(nums[right]);

            if (s.size() == k){
                maxSum = Math.max(maxSum, curSum);
            }
        }

        return maxSum;

    }
}