
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {       
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array (Crucial step!)
        Arrays.sort(nums);
        
        // 2. Loop through the array with the "Captain"
        for (int cap = 0; cap < nums.length - 2; cap++) {
            
            // [SKIP DUPLICATES] If the Captain is the same as the previous one, skip it.
            // This prevents duplicate triplets like [-1, 0, 1] appearing twice.
            if (cap > 0 && nums[cap] == nums[cap - 1]) {
                continue;
            }

            int left = cap + 1;       // Left Scout starts right after Captain
            int right = nums.length - 1; // Right Scout starts at the end

            // 3. The Two-Pointer Search
            while (left < right) {
                int sum = nums[cap] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet!
                    // IMPORTANT: Add the VALUES, not the indices!
                    result.add(Arrays.asList(nums[cap], nums[left], nums[right]));

                    // Skip duplicates for Left and Right scouts
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both scouts inward
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    // Sum is too small, need a bigger number -> Move Left Scout right
                    left++;
                } 
                else {
                    // Sum is too big, need a smaller number -> Move Right Scout left
                    right--;
                }
            }
        }

        return result;
    }
}