class Solution {
public:
    int maxArea(vector<int>& height) {
        int lp = 0;
        int rp = height.size() - 1;
        int highest = 0;

        int wd, ht, area;
        while (lp < rp){
            wd = rp - lp;
            ht = min(height[lp], height[rp]);
            area = ht * wd;

            if (area > highest){
                highest = area;
            }

            if (height[lp] < height[rp]){
                lp++;
            }
            else {
                rp--;
            }
        }
        return highest;
    }
};