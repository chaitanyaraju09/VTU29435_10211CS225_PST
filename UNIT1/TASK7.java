class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        return call(nums,ans,0);
    }
    public int[] call(int[] nums, int[] ans,int i){
        if(i == nums.length)return ans;
        ans[i] = nums[nums[i]];
        return call(nums,ans,i+1);
    }
}

//  OUTPUT

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
