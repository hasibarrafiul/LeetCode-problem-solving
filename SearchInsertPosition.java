class Solution {
    public int searchInsert(int[] nums, int target) {
        int found_index = 0;
        int expected_index = 0;
        boolean found = true;
        int i=0;
        while(nums[i]!=target){
            if(target<nums[i]){
                found = false;
                break;
            }
            else{
                expected_index++;
            }
            found_index++;
            i++;
            if(i==nums.length) break;
        }
        if(found==true){
            return found_index;
        }
        else{
            return expected_index;
        }
    }
}
