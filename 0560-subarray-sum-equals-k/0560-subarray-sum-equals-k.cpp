class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int preSum = 0;
        int count = 0;
        map<int, int> mp;
        mp[0] = 1;

        for(auto i: nums){
            preSum += i;
            count += mp[preSum-k];
            mp[preSum] += 1;
        }
        return count;
    }
};
