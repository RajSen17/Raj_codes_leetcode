class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<digits.length; i++){
            for(int j = 0; j<digits.length; j++){
                for(int k = 0; k<digits.length; k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    if(digits[i]!=0 && num%2==0){
                        set.add(num);
                    }
                    
                }
            }
        }
        int[] nums = new int[set.size()];
        int i = 0;
        for(int it : set){
            nums[i++] = it;
        }
        Arrays.sort(nums);
        return nums;
    }
}