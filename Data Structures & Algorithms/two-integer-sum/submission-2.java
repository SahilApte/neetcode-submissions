class Solution {
    public int[] twoSum(int[] arr, int target) {
        int arrLength = arr.length;
        for(int i=0;i<arrLength-1;i++){
            for(int j=i+1;j<arrLength;j++){
                if(arr[i]+arr[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{0,0};


        
    }
}
