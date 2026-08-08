class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxi=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt=0;
            }
            maxi=Math.max(cnt,maxi);
        }

        return maxi;
        
    }
}
public class Main {
    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 1, 0, 1, 1, 1};

        // Create Solution object
        Solution obj = new Solution();

        // Get answer
        int ans = obj.findMaxConsecutiveOnes(nums);

        // Print result
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}