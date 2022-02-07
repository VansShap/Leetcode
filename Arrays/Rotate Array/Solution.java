class Solution {
    public void rotate(int[] nums, int k) {
		int var = nums[nums.length - 1];
		
		if (k > nums.length) {
			k = k % nums.length;
		}
		
		if (k < nums.length || k > nums.length) {
			int[] copy = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				copy[i] = nums[i];
			}
			for (int i = 0; i < k; i++) {
				nums[i] = copy[copy.length - k + i];
			}
			for (int i = 0; i < nums.length-k; i++) {
				nums[k+i] = copy[i];
			}
		}
	}
}
