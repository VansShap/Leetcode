class Solution {
	public int singleNumber(int[] nums) {
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			int counter = 0;
			for (int j = 0; j < nums.length; j++) {
				if (num == nums[j])
					counter++;
				if (counter == 2)
					break;
			}
			if (counter < 2)
				break;
		}
		return num;
		
	}
}