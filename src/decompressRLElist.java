import java.util.*;
class decompressRLElist 
{
	public static void main(String[] args) 
	{
		int[] nums = {1,1,2,3};
		 int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i+=2)
        {
            count+=nums[i];
        }
		int[] res = new int[count];
        int idx =0;
		
		for(int i=0;i<n/2;i++){
			int frq = nums[2*i];
			int val = nums[2*i+1];
			
            while(frq-- > 0){
                res[idx++] = val;
            }
		}
		for(int i = 0;i<count;i++){
			System.out.print(res[i]+" ");
		}
	}

	 public int[] decompressRLElist(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i += 2) {
      count += nums[i];
    }
    int idx = 0;
    int[] ans = new int[count];
    for (int i = 1; i < nums.length; i+= 2) {
      int freq = nums[i - 1];
      int val = nums[i];
      while (freq-- > 0) {
        ans[idx++] = val;
      }
    }
    return ans;
  }
}
