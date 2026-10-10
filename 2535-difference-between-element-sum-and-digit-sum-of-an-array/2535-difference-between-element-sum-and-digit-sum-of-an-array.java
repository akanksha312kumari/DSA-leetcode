class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;

        for (int i = 0; i < nums.length; i++){
            eSum += nums[i];

            int n = nums[i];
            while(n > 0){
                int d = n % 10;
                dSum += d;
                n /= 10;
            }
        }

        return Math.abs(eSum - dSum);
    }
}