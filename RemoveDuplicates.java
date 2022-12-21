class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        
        int k = 0;
        boolean bool = true;
        for(int i=0;i<size; i++){
            for(int j=0;j<=k; j++){
                if(i!=j && nums[i]==nums[j]){
                    bool = false;
                }
            }
            if(bool == true){
                nums[k] = nums[i];
                k++;
            }else{
                bool = true;
            }
        }
        return k;
    }
}
