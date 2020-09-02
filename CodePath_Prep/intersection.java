package CodePath_Prep;

class ListNode {
    int data;
    ListNode next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
    ListNode(int d) {
        data = d;
    }
}

public class intersection {

    public static ListNode getIntersectionNode(ListNode list1, ListNode list2) {

        if (list1 == null || list2 == null)
            return null;
        ListNode oneCurr = list1;
        ListNode twoCurr = list2;
        int lengthone = 0;
        int lengthtwo = 0;
        while (twoCurr != null) {
            lengthtwo++;
            twoCurr = twoCurr.next;
        }
        while (oneCurr != null) {
            lengthone++;
            oneCurr = oneCurr.next;
        }
        ListNode smallList = (lengthone < lengthtwo) ? list1 : list2;
        ListNode bigList = (lengthone >= lengthtwo) ? list1 : list2;
        int biglength = Math.max(lengthone, lengthtwo);
        int smalllength = Math.min(lengthone, lengthtwo);

        for (int x = 0; x < biglength; x++) {
            if (smallList.data == bigList.data) {
                return smallList;
            }
            if (x >= (biglength - smalllength)) {
                smallList = smallList.next;
            }
            bigList = bigList.next;
        }

        return null;

    }

}