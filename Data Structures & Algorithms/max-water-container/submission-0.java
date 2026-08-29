class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = height * width;

             max = Math.max(max, area);
            if (heights[left] < heights[right]) {
                left++;

            } else if (heights[right] < heights[left]) {
                right--;
            }
            else left++;
        }

        return max;
    }
}
