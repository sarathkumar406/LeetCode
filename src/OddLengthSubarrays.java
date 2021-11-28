class OddLengthSubarrays 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,4,2,5,3};
		int n = arr.length;
		/*int sum =0;
		int count =0;
		int m =1;
		for(int i =0;i<n;i++){
			sum+=arr[i];
		}

		while(m<=n){
			for(int j =0;j<m;j++){
				count+=arr[j];
				System.out.print(arr[j]+" ");
			}
			m+=2;
			System.out.println();
			System.out.println("m value "+m);
		}
		System.out.println(sum);
		System.out.println(count);*/


		int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int currSum = 0;
      for (int j = i; j < arr.length; j++) {
        currSum += arr[j];
        if ((j - i + 1) % 2 != 0) {
          sum += currSum;
        }
      }
    }
			System.out.println(sum);
	}
}

 