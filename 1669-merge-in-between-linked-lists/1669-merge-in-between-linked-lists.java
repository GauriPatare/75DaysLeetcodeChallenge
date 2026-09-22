class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode beforeA = list1;

        for (int i = 0; i < a - 1; i++) {
            beforeA = beforeA.next;
        }

        ListNode afterB = list1;

        for (int i = 0; i <= b; i++) {
            afterB = afterB.next;
        }

        ListNode list2End = list2;

        while (list2End.next != null) {
            list2End = list2End.next;
        }

        beforeA.next = list2;
        list2End.next = afterB;

        return list1;
    }
}