package MergeTwoSortedLists;

public class Solution {
    // STT 21
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return res.next;
    }

    // Hàm tiện ích: dựng list từ mảng
    private static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Hàm tiện ích: chuyển list -> chuỗi dạng [a,b,c]
    private static String listToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (node != null) {
            sb.append(node.val);
            node = node.next;
            if (node != null) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);

        ListNode merged = solution.mergeTwoLists(list1, list2);

        System.out.println("Input: list1 = [1,2,4], list2 = [1,3,4]");
        System.out.println("Output: " + listToString(merged));

    }
}
