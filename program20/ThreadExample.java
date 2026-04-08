class TableThread extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class PrimeThread extends Thread {
    int n;

    PrimeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("First " + n + " Prime Numbers:");
        int count = 0, num = 2;

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        TableThread t1 = new TableThread();
        PrimeThread t2 = new PrimeThread(5);

        t1.start();
        t2.start();
    }
}
