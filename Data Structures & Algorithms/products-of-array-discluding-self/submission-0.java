class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length,mul=1;
        int[] suf=new int[l];
        int[] pre=new int[l];
        for(int i=0;i<l;i++)
        {pre[i]=mul;
        mul=mul*nums[i];}
        mul=1;
        for(int i=l-1;i>=0;i--)
        {suf[i]=mul;
        mul=mul*nums[i];
        }
        for(int i=0;i<l;i++){
            nums[i]=suf[i]*pre[i];
        }
        return nums;
    }
}  
