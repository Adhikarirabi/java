package java_3.concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. Reasoning should be created by inheriting from the Thread class.

    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A process is a program under execution i.e an active program and A thread is a lightweight process that can be managed independently by a scheduler. ");
        System.out.println("If you invoke the run method, No new thread is created and the run() method is executed on the calling thread itself.");
    }

    @Override
    public void run() {
        distinguish();
    }
}

