class StudentsHomework 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	 public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        if(startTime.length ==0 || endTime.length ==0)
            return 0;
        int count = 0;
        for(int i =0;i<startTime.length;i++)
        {   
            if(startTime[i]==queryTime || endTime[i]==queryTime)
            {
                count++;
            }
            else if(startTime[i] < queryTime && endTime[i] > queryTime)
            {
                count++;
            }
        }
        return count;
    }
}
