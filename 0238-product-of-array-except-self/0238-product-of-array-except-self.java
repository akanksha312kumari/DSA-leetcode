class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int prefix = 1;
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix = prefix * nums[i-1];
            ans[i] = prefix;
        }

        int suffix = 1;
        for (int j = nums.length-2; j >= 0; j--){
            suffix = suffix * nums[j+1];
            ans[j] = suffix * ans[j]; 
        }
        return ans;

    }
}