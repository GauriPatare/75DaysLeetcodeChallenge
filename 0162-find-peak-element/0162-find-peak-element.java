class Solution {
    public int findPeakElement(int[] nums) {
       
        int low = 0, high = nums.length - 1;
        while (low < high) {
           
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
              
                low = mid + 1;
            }
        }
        return low;
    }
}

public class Main {
    public static void main(String[] args) {
      
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        Solution obj = new Solution();
        System.out.println(obj.findPeakElement(nums));
    }
}
