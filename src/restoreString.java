class restoreString 
{
	public static void main(String[] args) 
	{
		int[] indices = {4,5,6,7,0,1,2,3};

		String s = "codeleet";
		char[] ch = new char[s.length()];
		for(int i =0;i<indices.length;i++){
			ch[indices[i]] = s.charAt(i);
		}

		System.out.println(new String(ch));
	}
}
