class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[n];

        int alice;
        int bob;

        int idx = 0;
        for(int i = 0; i < n-1; i += 2){
            alice = i;
            bob = i+1;
            arr[i] = nums[bob];
            arr[i+1] = nums[alice];

        }
        return arr;
    }
}