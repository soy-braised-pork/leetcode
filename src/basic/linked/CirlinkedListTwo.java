package basic.linked;

import basic.linked.CirlinkedList.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhulx
 **/
public class CirlinkedListTwo {

    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}

