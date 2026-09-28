class Thread_impl extends Thread
{
    public void run()
    {
        System.out.println("Hi");
        System.out.println("Hello");
        System.out.println("Bye Bye");
    }

    public static void main(String[] args) {
        Thread_impl t1 = new Thread_impl();
        Thread_impl t2 = new Thread_impl();
        Thread_impl t3 = new Thread_impl();

        t1.start();
        t2.start();
        t3.start();
    }
}
