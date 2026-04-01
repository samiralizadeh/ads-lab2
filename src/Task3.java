public class Task3 {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.print();

        q.dequeue();
        q.print();

        System.out.println(q.is_empty());

        q.clear();
        System.out.println(q.is_empty());
    }
}