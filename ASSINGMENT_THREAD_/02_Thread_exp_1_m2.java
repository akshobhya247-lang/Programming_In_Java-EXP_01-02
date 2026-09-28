class B_Thread_imple_2 extends Thread
{
    public void run()
    {
        System.out.println("Hi");
        System.out.println("Hello");
        System.out.println("Bye Bye");
    }

    public static void main(String[] args) {
        B_Thread_imple_2 t1 = new B_Thread_imple_2();
        Thread t = new Thread(t1);

        B_Thread_imple_2 t2 = new B_Thread_imple_2();
        Thread tt = new Thread(t2);

        t.start();
        tt.start();
    }
}
