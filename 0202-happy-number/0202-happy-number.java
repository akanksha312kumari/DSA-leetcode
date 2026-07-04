class Solution {
    public boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));

        while (slow!=fast ){
            
            slow = square(slow);
            fast = square(square(fast));

            if (slow == 1 || fast == 1){
                return true;
            }

        }
        return slow == 1;
    }

    public int square(int a){
        int sq = 0;
        while (a > 0){
            int r = a % 10;
            sq = sq + r*r;
            a = a/10;
        }
        return sq;
    }

}