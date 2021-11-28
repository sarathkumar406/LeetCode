class xorOperation 
{
	public static void main(String[] args) 
	{
		int n = 10, start=5;
		int[] nums = new int[n];
		int res = 0;
		for(int i =0;i<n;i++){
			nums[i] = start + 2*i;
			res ^=nums[i];
		}
		System.out.println();
		System.out.println(res);
	}
}
