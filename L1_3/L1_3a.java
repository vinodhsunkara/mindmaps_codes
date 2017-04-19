public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length, half = len/2, count =0, maj = 0;
        for(int i =0 ; i<len; i++) {
            if(count == 0) {
                maj = nums[i];
                count ++;
            } else if(maj == nums[i]) {
                count++;
            } else{
                count--;
            }
        }
        return maj;
    }
}