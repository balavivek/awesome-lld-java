package awesome.lld.java.concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinApp {
    public static void main(String[] args) {
        // Create a large array of integers
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Create an ArraySumTask
        ArraySumTask task = new ArraySumTask(array, 0, array.length);

        // Execute the task and get the result
        int result = pool.invoke(task);

        // Print the result
        System.out.println("Sum: " + result);
    }
}
