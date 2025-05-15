class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int>f1(26,0);

        if(s.size() != t.size()){
            return false;
        }

        for(int i=0;i<s.size();i++){
            f1[s[i]-'a']++;
            f1[t[i]-'a']--;
        }

        for(int i=0;i<26;i++){
            if(f1[i]!=0){
                return false;
            }
        }
        return true;
    }
};