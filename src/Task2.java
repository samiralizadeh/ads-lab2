public class Task2 {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(5);

        s.print();

        s.removeLessThanAverage();

        s.print();
    }
}