class HighestAltitude 
{
	public static void main(String[] args) 
	{
		//int[] ar = {-5,1,5,0,-7};
		int[] ar = {-4,-3,-2,-1,4,3,2};
		int[] res = new int[ar.length+1];
		res[0] = 0;
		int sum = 0, max = 0, count = 0;
		for(int i = 0;i<ar.length;i++,++count){
			sum+=ar[i];
			res[count] = sum;
			if(res[i] > max){
				max = res[i];
			}
		}
		System.out.println(max);
	}
}
