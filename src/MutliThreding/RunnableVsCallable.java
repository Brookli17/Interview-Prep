package MutliThreding;

import java.util.concurrent.*;

public class RunnableVsCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> task = () -> {
            return 10 + 20;
        };

        ExecutorService service = Executors.newFixedThreadPool(1);

        Future<Integer> future =
        service.submit(task);

        System.out.println(future.get());
    }
}
