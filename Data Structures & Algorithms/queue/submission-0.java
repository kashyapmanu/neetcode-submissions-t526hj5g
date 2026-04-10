class Deque {
    private static class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
    
    private Node dHead;
    private Node dTail;

    public Deque() {
        dHead = new Node(0);
        dTail = new Node(0);
        dHead.next = dTail;
        dTail.prev = dHead;
    }

    public boolean isEmpty() {
        return (dHead.next == dTail && dTail.prev == dHead);
    }

    public void append(int value) {
        // Add at the tail.
        Node newNode = new Node(value);
        newNode.next = dTail;
        newNode.prev = dTail.prev;
        dTail.prev.next = newNode;
        dTail.prev = newNode;
    }

    public void appendleft(int value) {
        // Add at the head.
        Node newNode = new Node(value);
        newNode.next = dHead.next;
        newNode.prev = dHead;
        dHead.next.prev = newNode;
        dHead.next = newNode;
    }

    public int pop() {
        if (isEmpty()) return -1;
        // Remove at the tail
        Node targetNode = dTail.prev;
        targetNode.prev.next = dTail;
        dTail.prev = targetNode.prev;
        return targetNode.value;
    }

    public int popleft() {
        if (isEmpty()) return -1;
        // Remove at the head.
        Node targetNode = dHead.next;
        dHead.next = targetNode.next;
        targetNode.next.prev = dHead;
        return targetNode.value;
    }
}
