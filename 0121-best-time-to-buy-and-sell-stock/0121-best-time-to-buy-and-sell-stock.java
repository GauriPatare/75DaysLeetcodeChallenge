class Solution {
    public int maxProfit(int[] prices) {
      int minprice=Integer.MAX_VALUE;
      int maxprofit=0;

      for(int price:prices){
        if(price<minprice){
            minprice=price;
        }
        else{
            maxprofit=Math.max(maxprofit,price-minprice);

        }
    }
    return maxprofit;
    }
}

public class main{
     public static void main(String[]args){
        int []prices={7,1,5,3,6,4};
        Solution obj=new Solution();
        System.out.println(  obj.maxProfit(prices) );

     }
    
}