class LinkedList {
    private Node head;

    class Node {
        private int value;
        private Node pointer;

        public Node(int value) {
            this.value = value;
        }

        public void setNext(Node p) {
            this.pointer = p;
        }

        public Node next() {
            return pointer;
        }

        public int getValue() {
            return value;
        }
    }

    public LinkedList() {
        
    }

    public int get(int index) {
        if(head == null) return -1;
        Node start = head;
        
        for (int i = 0; i < index; i++) {
            if (start == null) return -1;

            start = start.next();
        }

        if (start == null) return -1;

        return start.getValue();
    }

    public void insertHead(int val) {
        Node oldHead = head;
        this.head = new Node(val);
        this.head.setNext(oldHead);
    }

    public void insertTail(int val) {
        if (this.head == null) {
            head = new Node(val);
            return;
        }
        Node start = this.head;

        while(start.next() != null) {
            start = start.next();
        }

        start.setNext(new Node(val));
    }

    public boolean remove(int index) {
        if(index == 0) {
            if (head != null) {
                head = head.next();
                return true;
            } else {
                return false;
            }
        }
        Node start = head;
        for (int i = 0; i < index - 1; i++) {
            if (start == null || start.next() == null) return false;

            start = start.next();
        }

        if(start == null || start.next() == null) return false;
        
        start.setNext(start.next().next());

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();

        Node start = head;
        while (start != null) {
            values.add(start.getValue());
            start = start.next();
        }

        return values;
    }
}
