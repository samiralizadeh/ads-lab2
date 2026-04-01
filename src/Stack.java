class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    boolean is_empty() {
        return top == null;
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (is_empty()) return -1;
        int value = top.data;
        top = top.next;
        return value;
    }

    void print() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void clear() {
        top = null;
    }

    void removeLessThanAverage() {
        if (is_empty()) return;

        Node temp = top;
        int count = 0;
        double sum = 0;

        while (temp != null) {
            sum += temp.data;
            count++;
            temp = temp.next;
        }

        double avg = sum / count;

        Stack newStack = new Stack();

        temp = top;
        while (temp != null) {
            if (temp.data >= avg) {
                newStack.push(temp.data);
            }
            temp = temp.next;
        }

        Stack result = new Stack();
        while (!newStack.is_empty()) {
            result.push(newStack.pop());
        }

        top = result.top;
    }
}