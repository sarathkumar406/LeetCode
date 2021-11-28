class countGoodTriplets 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,0,1,1,9,7};
		int a = 7, b = 2, c = 3;
		int n = arr.length;
		for(int i =0;i<n-2;i++){

			for(int j =i+1;j<n-1;j++){
				for(int k =j+1;k<n;k++){
					//System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					int a1 = Math.abs(arr[i]);
					int b1 = Math.abs(arr[j]);
					int c1 = Math.abs(arr[k]);
					int sum = a1+b1+c1;
					//System.out.println(a1-b1);
					if((a1-b1) <= a && (b1-c1) <= b && (a1-c1) <= c){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}

				}
			}
		}
	}
}
