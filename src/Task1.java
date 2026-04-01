public class Task1 {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.print();

        s.pop();
        s.print();

        System.out.println(s.is_empty());

        s.clear();
        System.out.println(s.is_empty());
    }
}