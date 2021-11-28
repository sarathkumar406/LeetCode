import java.util.*;
class GoodPairs 
{
	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,1,1,3};
		//int[] nums = {1,2,3};
		int n = nums.length;
		
		// Approach -1

		/*int count = 0;
		for(int i =0;i<n;i++){
			for(int j =i+1;j<n && j > i;j++){
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
		}*/

		// Approach -2

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int num : nums) {
		  count += map.getOrDefault(num, 0);
		  map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println("Count --->> "+count);
	}
}
