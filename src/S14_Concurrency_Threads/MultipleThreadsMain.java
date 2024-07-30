package S14_Concurrency_Threads;

import java.util.concurrent.TimeUnit;

public class MultipleThreadsMain {
    public static void main(String[] args) {

        /**
         * The below code have interleaving as 3 stopwatches share
         * 1 single instance of stopwatch. We will fix this ahead.
         */
//        StopWatch stopWatch = new StopWatch(TimeUnit.SECONDS);
//        Thread green = new Thread(stopWatch::countdown, ThreadColor.ANSI_GREEN.name());
//        Thread purple = new Thread(() -> stopWatch.countdown(7), ThreadColor.ANSI_PURPLE.name());
//        Thread red = new Thread(stopWatch::countdown, ThreadColor.ANSI_RED.name());
//        green.start();
//        red.start();
//        purple.start();


        StopWatch greenWatch = new StopWatch(TimeUnit.SECONDS);
        StopWatch purpleWatch = new StopWatch(TimeUnit.SECONDS);
        StopWatch redWatch = new StopWatch(TimeUnit.SECONDS);

        Thread green = new Thread(greenWatch::countdown, ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(() -> purpleWatch.countdown(7), ThreadColor.ANSI_PURPLE.name());
        Thread red = new Thread(redWatch::countdown, ThreadColor.ANSI_RED.name());
        green.start();
        red.start();
        purple.start();


    }
}

class StopWatch {
    private TimeUnit timeUnit;
    private int i;

    public StopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }


    public void countdown(){
        countdown(5);
    }

    public void countdown(int unitcount){
        String threadName = Thread.currentThread().getName();
        ThreadColor threadColor = ThreadColor.ANSI_RESET;

        try {
            threadColor = ThreadColor.valueOf(threadName);
        }catch (IllegalArgumentException ignore){
        }

        String color = threadColor.color();

        //Here i is unitcount, dedicated to each individual thread.
        //What if we make it a class field ?
        for(i = unitcount; i > 0; i--){
            try {
                timeUnit.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("%s%s Thread : i = %d%n", color, threadName, i);
        }

    }
}
