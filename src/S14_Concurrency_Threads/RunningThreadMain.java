package S14_Concurrency_Threads;

public class RunningThreadMain {
    public static void main(String[] args) {

        System.out.println("Main is running");
        try {
            System.out.println("Main thread paused for 1 second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread thread = new Thread(
            () -> {
                String tname = Thread.currentThread().getName();
                System.out.println(tname + " should take 10 dots to run.");
                for (int i = 0; i < 10; i++) {
                    System.out.print(". ");
                    try{
                        Thread.sleep(500);
//                        System.out.println("A. State = " + Thread.currentThread().getState());
                    }catch (InterruptedException e){
                        System.out.println("\nOops!! " + tname + " interrupted!");
//                        System.out.println("A1. State = " + Thread.currentThread().getState());
//                        e.printStackTrace();
                        /**
                         * Sometimes when method where thread is interrupted is not ready
                         * to handle it, so the exception has to be RE-ASSERTED, i.e the
                         * thread has to be re interrupted!
                         */
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println("\n" + tname + " completed.");
            }
        );

        Thread installThread = new Thread(() -> {
           try {
               for (int i = 0; i < 3; i++) {
                   Thread.sleep(250);
                   System.out.println("Installation Step " + (i + 1) +
                           " is completed.");
               }
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }, "InstallThread");

        Thread threadMonitor = new Thread(() -> {
            long now = System.currentTimeMillis();
            while (thread.isAlive()){
//                System.out.println("\nWaiting for thread to complete");
                try {
                    Thread.sleep(1000);
//                System.out.println("B. State = " + thread.getState());
                    if(System.currentTimeMillis() - now > 8000){
                        thread.interrupt();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });


        System.out.println(thread.getName() + " starting...");
        thread.start();
        threadMonitor.start();



        try {
            // joins thread to currentThread (in this case main thread)
            //and main thread will wait for this thread to complete b4
            //proceeding ahead.
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if(!thread.isInterrupted()){
            installThread.start();
        }else {
            System.out.println("Previous thread was interrupted, "+
                    installThread.getName() + " can't run.");
        }

//        System.out.println("C. State = "+ thread.getState());

    }
}
