class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, max_area = 0;
        while (left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            if (area > max_area)
                max_area = area;
            if (left < right && heights[left] > heights[right])
                right--;
            else
                left++;
        }
        return max_area;
    }
}
