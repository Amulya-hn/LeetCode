class Solution {
    public boolean isPossible(int[] nums, int p, int diff){
        int i=0;
        while(i<nums.length-1)
        {
            if(nums[i+1]-nums[i]<=diff)
            {
                --p;
                i=i+2;
            }
            else
               ++i;
        }
        return p<=0;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=nums.length;
        int low=0;
        int high=nums[l-1]-nums[0];
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(nums,p,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}