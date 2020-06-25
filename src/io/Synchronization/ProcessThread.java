package io.Synchronization;

public class ProcessThread implements Runnable{

    Process p=new Process();
    @Override
    public void run() {
        p.processor();
    }
}
