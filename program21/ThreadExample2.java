class FibonacciThread extends Thread {
    int n;

    FibonacciThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class EvenThread extends Thread {
    int start, end;

    EvenThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        FibonacciThread t1 = new FibonacciThread(10);
        EvenThread t2 = new EvenThread(1, 20);

        t1.start();
        t2.start();
    }
}
