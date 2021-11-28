class minTimeToVisitAllPoints 
{
	public static void main(String[] args) 
	{
		int[][] points = {{1,1},{3,4},{-1,0}};
		int time = 0;
		for(int i =1;i<points.length;i++){
			int[] prePoint = points[i-1];
			int[] currentPoint = points[i];

			time+=Math.max(Math.abs(prePoint[0]-currentPoint[0]),Math.abs(prePoint[1]-currentPoint[1]));

		}
		System.out.println(time);
	}
}

//formula
//-------
//Max((x2-x1),(y2-y1));
