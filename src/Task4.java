public class Task4 {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);

        q.print();

        q.removeEven();

        q.print();
    }
}