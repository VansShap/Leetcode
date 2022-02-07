class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {1,1,2};
		int k = s.removeDuplicates(arr);
		System.out.println(k);
		for (int i : arr)
			System.out.println(i);
	}
}

