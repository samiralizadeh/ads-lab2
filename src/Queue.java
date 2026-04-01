class QNode {
    int data;
    QNode next;

    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    QNode front;
    QNode rear;

    Queue() {
        front = null;
        rear = null;
    }

    boolean is_empty() {
        return front == null;
    }

    void enqueue(int x) {
        QNode newNode = new QNode(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (is_empty()) return -1;

        int value = front.data;
        front = front.next;

        if (front == null) rear = null;

        return value;
    }

    void print() {
        QNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void clear() {
        front = rear = null;
    }

    void removeEven() {
        Queue newQueue = new Queue();

        while (!is_empty()) {
            int x = dequeue();
            if (x % 2 != 0) {
                newQueue.enqueue(x);
            }
        }

        while (!newQueue.is_empty()) {
            enqueue(newQueue.dequeue());
        }
    }
}