class Solution {
    public int singleNumber(int[] nums) {
       int XOR=0;
       for(int i=0;i<nums.length;i++){
        XOR=XOR^nums[i];
       }
       return XOR; 
    }
}
public class Main{
     public static void main(String[] args) {
        int nums[]={2,2,1};
        Solution obj=new Solution();
        int result=obj.singleNumber(nums);
        System.out.print("single number is"+result);
    }
}