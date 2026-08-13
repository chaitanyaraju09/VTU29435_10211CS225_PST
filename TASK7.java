class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ls=0;
        int rs=0;
        int[] res=new int[nums.length];
        
        for(int ind=nums.length-1;ind>=0;ind--){
            ls=nums[i]*nums[i];
            rs=nums[j]*nums[j];
            if(ls>rs){
                res[ind]=ls;
                i++;

            }
            else{
                res[ind]=rs;
                j--;
            }

        }
        return res;
        
    }
}

//  OUTPUT 

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
