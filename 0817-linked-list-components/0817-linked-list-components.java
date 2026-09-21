
class Solution {
    public int numComponents(ListNode head, int[] nums) {

        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        ListNode current = head;

        while (current != null) {

            if (set.contains(current.val)) {

               
                if (current.next == null ||
                    !set.contains(current.next.val)) {

                    count++;
                }
            }

            current = current.next;
        }

        return count;
    }
}
