class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        int flag = -1;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] >= 0){
                flag = 0;
                break;
            }
        }

        if (flag == -1){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i< nums.length; i++){
                max = Math.max( max, nums[i]);
            }
            return max;
        }

        for (int i = 0; i< nums.length; i++){
            cs = cs + nums[i];

            if (cs < 0){
                cs = 0;
            }

            ms = Math.max(cs,ms);
        }
        return ms;
    }
}