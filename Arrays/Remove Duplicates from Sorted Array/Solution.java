class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int length = nums.length;
		
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
				length--;
                continue;
            } else {
                nums[index] = nums[i-1];
				nums[index+1] = nums[i];
                index++;
            }
        }
		
		return length;
    }
}