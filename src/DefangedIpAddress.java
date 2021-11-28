class DefangedIpAddress 
{
	public static void main(String[] args) 
	{
		String str = "1.1.1.1";

		str = str.replace(".","[.]");
		System.out.println(str);

		double d = 53.229166;
		int ceil = (int)Math.ceil(d);
		int floor = (int)Math.floor(d);
		int round = (int)Math.round(d);

		System.out.println("ceil ----->>> "+ceil);
		System.out.println("floor ----->>> "+floor);
		System.out.println("round ----->>> "+round);
	}
}
