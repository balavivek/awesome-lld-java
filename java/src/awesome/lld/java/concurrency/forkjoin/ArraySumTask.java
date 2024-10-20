package awesome.lld.java.concurrency.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * The ArraySumTask class calculates the sum of a portion of an array.
 */
public class ArraySumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 1000; // Threshold for splitting tasks
    private int[] array;
    private int start;
    private int end;

    /**
     * Constructs a new ArraySumTask.
     *
     * @param array The array to sum.
     * @param start The starting index of the portion to sum.
     * @param end The ending index of the portion to sum.
     */
    public ArraySumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            // If the task is small enough, compute directly
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            // Split the task into smaller tasks
            int mid = (start + end) / 2;
            ArraySumTask leftTask = new ArraySumTask(array, start, mid);
            ArraySumTask rightTask = new ArraySumTask(array, mid, end);

            // Fork the subtasks
            leftTask.fork();
            rightTask.fork();

            // Join the results
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            // Combine the results
            return leftResult + rightResult;
        }
    }
}
