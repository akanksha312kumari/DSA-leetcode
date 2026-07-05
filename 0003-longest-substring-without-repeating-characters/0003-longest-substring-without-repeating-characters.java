class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxCount = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                count --;
                left++;
            }

            set.add(s.charAt(right));
            count++;

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}