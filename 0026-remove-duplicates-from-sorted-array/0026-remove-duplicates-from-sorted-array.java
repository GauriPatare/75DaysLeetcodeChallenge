class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int i=0;

        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;


        
    }
}

public class main{
    public static void main(String[]args){
        int [] nums={1,1,2};

        Solution sol=new Solution();
        int k=sol.removeDuplicates(nums);
        System.out.println("unique count"+k);
        System.out.print("Array after remove duplicates:");
        for(int x=0;x<k;x++){
            System.out.print(nums[x]+"");
        }
    }
}