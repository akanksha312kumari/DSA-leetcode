class Solution {
    public int search(int[] nums, int target) {
        
        int point = nums.length;
        for (int i=1; i<nums.length; i++){
            if (nums[i]<nums[i-1]){
                point = i;
                break;
            }
        }

        

        int start;
        if (nums[0] > target){
            for (int i= point; i<nums.length; i++){
                if (nums[i]==target){
                    return i;
                }
            }
        } else {
            for (int i=0; i<point; i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }

        

        return -1;
    }
}