package awesome.lld.fundamentals.concurrency.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        fireAndForgot();
        submitAndFuture();
    }

    public static void fireAndForgot() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable emailTask1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("sending email to user 1 using Thread : " + Thread.currentThread().getName());
            }
        };

        Runnable emailTask2 = () -> {
            System.out.println("sending email to user 2 using Thread : " + Thread.currentThread().getName());
        };

        Runnable emailTask3 = () -> {
            System.out.println("sending email to user 3 using Thread : " + Thread.currentThread().getName());
        };

        executorService.execute(emailTask1);
        executorService.execute(emailTask2);
        executorService.execute(emailTask3);

        executorService.shutdown();
    }

    public static void submitAndFuture(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try{
            Callable<String> task = () -> {
                Thread.sleep(1000);
                return "Task completed by "+Thread.currentThread().getName();
            };
            Future<String> futureTask = executorService.submit(task);
            System.out.println(futureTask.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }

    }
}
