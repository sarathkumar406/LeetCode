import java.util.*;
class maxProduct 
{
	public static void main(String[] args) 
	{
		int[] nums = {3,4,5,2};
		int n = nums.length;
		/*Arrays.sort(nums);
		System.out.println(nums[nums.length-1]);
		System.out.println(nums[nums.length-2]);
		        int i = n-1;
        int j = n-2;
        System.out.println((nums[i]-1)*(nums[j]-1));*/
		int firstMax =0, secondMax =0;
		for(int i =0;i<n;i++){
			if(nums[i] > firstMax)// 4 > 3, 5 > 4, 2 > 5 -- false
			{
				secondMax = firstMax;// 0, 3, 4
				firstMax = nums[i];// 3, 4, 5
			}
			else if(nums[i] > secondMax) // 2 > 4 -- false
			{
				secondMax = nums[i]; //
			}
		}
		System.out.println(firstMax);// 5
		System.out.println(secondMax);// 4
		System.out.println((firstMax-1)*(secondMax-1));


	}
	 public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = n-1;
        int j = n-2;
        return (nums[i]-1)*(nums[j]-1);
    }
}
