class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> myset;
        vector<int> res;
        for( int it : nums1){
            myset.insert(it);

        }
        for(int it  :  nums2){
            if(myset.count(it)){
                res.push_back(it);
                myset.erase(it);
            }
        }
        
        return res;
    }
};