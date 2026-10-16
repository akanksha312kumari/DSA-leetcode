class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;

        int sum = 0;
        int pro = 1;

        while (num > 0){
            int d = num % 10;
            pro *= d;
            sum += d;
            num /= 10;
        }

        return pro - sum;
    }
}