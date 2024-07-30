package S14_Concurrency_Threads;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Some Terminologies
 * 1. Process
 * 2. Heap
 * 3. Thread
 * 4. Process and thread
 * 5. Thread and heap
 * 6. Thread and thread stack
 * 7. Concurrency -> advantages
 * 8. run() method -> compulsary override
 * 9. start() method
 * 10. Thread Priority (1 - low(MIN_PRIORITY), 5 - default(NORM_PRIORITY),
 *                      10 - MAX_PRIORITY)
 * 11. Implementing threads ->
 *      11.1 Extending Thread class,
 *      11.2 Using runnable functional interface and passing it to Thread constructor
 *      11.3
 * 12. start() vs run()
 * 13. native modifier -> c/c++ or dll file -> to access system level functionality, to interfare with hardware, to optimize performance
 * 14. Thread States ->
 *      14.1 NEW -> Thread not yet started
 *      14.2 RUNNABLE -> Thread under execution in JVM
 *      14.3 BLOCKED -> thread blocked waiting for a monitor lock
 *      14.4 WAITING -> Thread waiting indefinitely on another thread for particular task completion
 *      14.5 TIMED_WAITING -> Thread waiting for another thread to perform an action for upto a specified waiting time
 *      14.6 TERMINATED -> Thread that has exited
 * 15. TimeSlicing
 * 16. JMM - Java Memory Model
 *      16.1 Atomicity of Operations
 *      16.2 Synchronization
 * 17. Concurrent Thread Concepts
 *      17.1 Interference
 *      17.2 Interleaving -> Threads starting and pausing in the same blocks as other threads
 *      17.3 Order of thread execution can't be guaranteed
 *      17.4 Atomic Action - that happens all at once
 *      17.5 Thread safe - object / codeblock isnt compromised by execution of concurrent threads.
 *      17.6 Memory Inconsistency -> OS read from heap, make copy in thread's own storage cache. so changes are done on thread local first b4 going to hea
 *                                   This can make threads not see changes immediately reflected / visible.
 *      17.7 VOLATILE KEYWORD - that a class variable can be changed by multiple threads, thus ensuring that it is always read / written to memory and not to thread storage
 *      17.8 SYNCHRONIZED KEYWORD - diff invocations of synchronized methods on SAME object, guarantees not to interleave. If one is executing a synced method for an object,
 *                                  others have to block / wait until it is finished executing.
 *      17.9 - Critical section - when all critical sections are synchronized, the class is thread safe.
 *      17.10 - RE ENTRANT SYNCHRONIZATION
 *
 */
public class Main {

    public static void main(String[] args) {

        //Some static methods
        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);

        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currentThread);


        CustomThread customThread = new CustomThread();
        customThread.start();
        //We dont use run method and instead use start is because
        //main thread will treat run just like a normal method and
        //execute synchronously
//        customThread.run();


        Runnable myRunnable = () -> {
            for (int i = 1; i <= 8; i++){
                System.out.print(" 2 ");
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        for (int i = 1; i <= 3;i++){
            System.out.print(" 0 ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public static void printThreadState(Thread thread){
        System.out.println("----------------------------");
        System.out.println("Thread ID : " + thread.getId());
        System.out.println("Thread Name : " + thread.getName());
        System.out.println("Thread Priority : " + thread.getPriority());
        System.out.println("Thread State : " + thread.getState());
        System.out.println("Thread Group : " + thread.getThreadGroup());
        System.out.println("Thread Is Alive : " + thread.isAlive());
        System.out.println("----------------------------");
    }

}
