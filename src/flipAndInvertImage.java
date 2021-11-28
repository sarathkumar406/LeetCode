class flipAndInvertImage 
{
	public static void main(String[] args) 
	{
		int[][] image = {{1,1,0},{1,0,1,0},{0,0,0}};
		int[][] img = new int[image.length][image.length];
		for(int i =0;i<image.length;i++){
			//for(int j = image[i].length;j > 0;j--){
				/*if(image[i][j] == 1){
					img[i][j] =0;
				}
				else{
					img[i][j] = 1;
				}*/
				//System.out.print(i+" ");
				for(int j=image[i].length-1;j>=0;j--){
				//System.out.print(j+" ");
				//System.out.print(image[i][j]+" ");
				//img[i][j] = image[i][j]==1? 0:1;
			}
			System.out.println();
		}

System.out.println();
		for(int i= 0;i<image.length;i++){
			for(int j =0;j<image.length/2;j++){
				
				if(image[i][j]==image[i][image.length-j-1])
				{
					image[i][j]^=1;
					image[i][image.length-j-1] = image[i][j];
				}
			}
		}
	}
}
