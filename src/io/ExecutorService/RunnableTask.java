package io.ExecutorService;
// Runnable Task
public class RunnableTask implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Name:"+Thread.currentThread().getName());
    }
}
