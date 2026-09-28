class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class C_Thread_impl_num {
    public static void main(String[] args) {

        //Create Runnable State
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();    
        MyTask task3 = new MyTask();

        //Create Thread State
        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        Thread t3 = new Thread(task3, "Thread-3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

    }
}       


