class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        //calculate prefix at each step and store it in ans
        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            ans[i] = prefix;
            prefix *= nums[i];
            
        }

        //calculate suffix at each step and multiply with previous values of ans
        int suffix = 1;
        for (int j = nums.length-1; j >= 0; j--){
            ans[j] = suffix * ans[j];
            suffix = suffix * nums[j];
             
        }
        return ans;

    }
}