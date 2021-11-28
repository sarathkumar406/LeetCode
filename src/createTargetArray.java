import java.util.*;
class createTargetArray 
{
	public static void main(String[] args) 
	{
		int[] nums = {1};
		int[] index = {0};
		int[] target = new int[index.length];
		List<Integer> al = new ArrayList<>();
		for(int i =0;i<index.length;i++){
			al.add(index[i],nums[i]);
 		}

		for(int i =0;i<al.size();i++){
			target[i] = (int)al.get(i);
			System.out.print(target[i]+" ");
		}

	}
}
