class Solution {
    public int trap(int[] arr) {
        int leftM = 0;
        int rightM= 0;
        int left = 0;
        int right =arr.length-1;
        int water = 0;
        while(left<right){
            if(arr[left]<arr[right]){
            if(arr[left]>=leftM){
                leftM = arr[left];
            }
            else{
                water+= leftM-arr[left];
            }
            left++;
            }
            else{
                if(arr[right]>=rightM){
                    rightM = arr[right];
                }
                else{
                    water = water + rightM-arr[right];
                }
                right--;
            }

        }
        return water;


        
    }
}
