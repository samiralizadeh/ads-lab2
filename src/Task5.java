public class Task5 {

    static void heapify(int[] a, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] < a[smallest])
            smallest = left;

        if (right < n && a[right] < a[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;

            heapify(a, n, smallest);
        }
    }

    static void buildHeap(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    static void print(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = {10, 30, 20, 5, 15};

        print(a);

        buildHeap(a, a.length);

        print(a);
    }
}