class diagonalSum 
{
	public static void main(String[] args) 
	{
		int[][] matrix = {{1,2,4},
							{4,5,6},
							{7,8,9}};
		int sum =0;
		for(int i =0;i<matrix.length;i++){
			int j = matrix.length - i-1;
			sum+=matrix[i][i];
			System.out.println(i+" ---- "+j);
			System.out.println("sum "+sum);
			if(j!=i)
			{
				sum+=matrix[i][j];
			}
			System.out.println("sum --- "+sum);
			j--;
				
		}
		System.out.println(matrix.length);
		System.out.println(sum);
	}
}

/*
        int sum=0;
        int i=0,j=0;
        
        while(i<n)
        {
            sum+=mat[i][j];
            i++;
            j++;
        }
        
        i=0;
        j=n-1;
        
        while(i<n)
        {
          if(i!=j)   sum+=mat[i][j];
            
            i++;
            j--;
        }
        
        return sum;

		*/
