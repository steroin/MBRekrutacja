package ex3;

public class ParallelCounter {

    private static int counter = 1;

    private static void increaseCounter(int increasyBy) {
        for (int i = 0; i < increasyBy; i++) {
            System.out.println("Current counter value: " + counter);
            counter++;
        }
    }

    public static void main(String[] args) {
        new Thread(() -> increaseCounter(10)).start();
        new Thread(() -> increaseCounter(10)).start();
        new Thread(() -> increaseCounter(10)).start();
    }
}
