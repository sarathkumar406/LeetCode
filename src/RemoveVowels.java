import java.util.*;

class RemoveVowels 
{
	public static void main(String[] args) 
	{
		String str = "sarath";
		char[] ch = str.toCharArray();
		char[] res = new char[str.length()];
		char[] ch1 = {'a','e','i','o','u'};
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<ch1.length;i++){
			int count = 0;
			for(int j =0;j<ch.length;j++){
				if(ch1[i]!=ch[j])
				{
					res[count++] = ch[j];
				}
			}
		ch = res;
			
		}
		String str1 = new String(res);
		System.out.println(str1.trim());
		for(int i =0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
}
