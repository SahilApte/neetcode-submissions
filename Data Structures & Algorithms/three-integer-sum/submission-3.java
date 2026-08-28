
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int cap = 0; cap < nums.length - 2; cap++) {
            if (cap > 0 && nums[cap] == nums[cap - 1]) {
                continue;
            }

            int left = cap + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[cap] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[cap], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}