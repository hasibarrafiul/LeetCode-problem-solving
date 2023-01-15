class Solution {
    public int singleNumber(int[] nums) {
        boolean found = false;
        int res=-1;
        for(int i=0; i<nums.length; i++){
            found = false;
            for(int j=0;j< nums.length; j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                        found = true;
                    }
                    
                }
            }
            if(found == false){
                res = nums[i];
            }
        }
        return res;
    }
}
