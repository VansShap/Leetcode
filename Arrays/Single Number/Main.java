class Main{
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {2,2,3,1,1};
		long time = System.currentTimeMillis();
		int num = s.singleNumber(arr);
		System.out.println(System.currentTimeMillis() - time);
		//for (int a : arr)
		//	System.out.println(a);
		System.out.println(num);
	}
}