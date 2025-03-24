class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int res=0;
         int maxi=0;
        for(int i=0;i<nums.size();i++){
           
            if(nums[i]==1){
                maxi++;
                res = max(maxi,res);
            }else{
                maxi =0;
            }
        }
        return res;
    }
};