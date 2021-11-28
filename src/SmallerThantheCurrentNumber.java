class SmallerThantheCurrentNumber 
{
	public static void main(String[] args) 
	{
		//int[] nums = {8,1,2,2,3};
		int[] nums = {7,7,7,7};
		int n = nums.length;
		int[] res = new int[n];
		int count = 0;
		for(int i =0;i<n;i++){
			count = 0;
			for(int j =0;j<n;j++){
				if(j!=i && nums[j] < nums[i]){
					count++;
				}
			}
			res[i] = count;
		}

		for(int i =0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}

	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] counter = new int[101];
    for (int num : nums) {
      counter[num]++;
    }
    int sum = 0;
    int[] preSum = new int[101];
    for (int i = 0; i < 101; i++) {
      preSum[i] = sum;
      sum += counter[i];
    }
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = preSum[nums[i]];
    }
    return ans;
  }
}
