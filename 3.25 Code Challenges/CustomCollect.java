public class CustomCollect {

    Node node;

    static class Node {
        String str;
        Node next;

        public Node(String str) {
            this.str = str;
            this.next = null;
        }
    }

    // size

    
    // creating list
    public static LinkedList add(LinkedList linked, String str) {
        Node node = new Node(s);
        node.next = null;

        if (linked.head == null) {
            linked.head = node;
        } else {
            Node last = linked.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return linked;
    }
    // delete at a position


    // getting list
    public static String getList(LinkedList linked){
        Node curr = linked.node;
        while(curr.next != null){
            return curr.str;
            curr = curr.next;
        }
        return curr.str;
    }

    // removing list
}
