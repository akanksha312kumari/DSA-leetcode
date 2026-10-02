class Solution {
    public void sortColors(int[] nums) {
        //Dutch Natinal Flag Algorithm
        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while (mid <= high){
            if (nums[mid] == 0){
                //swap with low
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++; low++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }

    }
}