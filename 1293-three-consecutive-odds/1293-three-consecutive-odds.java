class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int it : arr){
            if(it%2==1){
                count++;
                if(count == 3) return true;
                
            }
            else count = 0;
        }
        return false;
    }
}