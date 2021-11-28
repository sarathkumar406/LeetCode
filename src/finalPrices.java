import java.util.*;
class finalPrices 
{
	public static void main(String[] args) 
	{
		int[] prices = {8,4,6,2,3};
		Stack<Integer> stack = new Stack<>();

    int[] finalPrice = new int[prices.length];
    for (int i = prices.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
        System.out.println("stack "+stack.pop());
      }
      finalPrice[i] = prices[i] - (stack.isEmpty() ? 0 : prices[stack.peek()]);
	  System.out.println("final price "+finalPrice[i]);
      stack.push(i);
	  System.out.println("stack --"+stack);
    }
		
		for(int j =0;j<finalPrice.length;j++){
			System.out.println(finalPrice[j]);
		}
		


		/*
			 int[] result = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
      int discount = 0;
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] <= prices[i]) {
          discount = prices[j];
          break;
        }
      }
      result[i] = prices[i] - discount;
    }
		*/
	}
	
}
