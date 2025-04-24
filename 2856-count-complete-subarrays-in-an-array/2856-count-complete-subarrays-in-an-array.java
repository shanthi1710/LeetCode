class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int ans=0;
        Map<Integer,Integer>arr = new HashMap<>();
        for(int i=0;i<n;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer>currArr = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            currArr.clear();
            for(int j=i;j<n;j++){
                currArr.put(nums[j],arr.getOrDefault(nums[j],0)+1);
                if(currArr.size()==arr.size()){
                    ans++;
                }
            }
        }
        return ans;

    }
}