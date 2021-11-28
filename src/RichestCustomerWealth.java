import java.util.*;
class RichestCustomerWealth 
{
	public static int maximumWealth(int[][] accounts) {
    return Arrays.stream(accounts)
        .map(e -> Arrays.stream(e).sum())
        .max(Integer::compareTo)
        .orElse(0);
  }
	public static void main(String[] args) 
	{
		//int[][] accounts = {{1,5},{7,3},{3,5}};
		int[][] accounts = {{1,2,3},{3,2,1}};
		int m = accounts.length;
		int max_value =	maximumWealth(accounts);
		System.out.println(max_value);
	//	System.out.println(m);
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i =0;i<m ;i++){
			sum = 0;
			for(int j =0;j<accounts[i].length;j++){
				System.out.print(accounts[i][j]+" ");
				sum+=accounts[i][j];
				max = Math.max(max,sum);
			}

			System.out.println();
		}

		System.out.println("Max Value is : "+max);
	}
	    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int ruleIdx = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);
        int count = 0;
       
        for(int i =0;i<items.size();i++)
        {
            String str = items.get(i).get(ruleIdx);
            if(str.equals(ruleValue))
            {
                 count++;
            }
        }
        return count;
        
    }
}
