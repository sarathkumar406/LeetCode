class sortArrayByParity 
{
	public static void main(String[] args) 
	{
		int[] A = {3,1,2,4};
		int[] res = new int[A.length];
		int n = A.length;
		int count = 0;
		for(int i=0;i<A.length;i++){
			if(A[i]%2 == 0)
			{
				res[count] = A[i];
				count++;
			}
			else
			{
				res[n-1] = A[i];
				n--;
			}
		}
		for(int i=0;i<A.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
