package java_3.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        List nums = new ArrayList<>();
        Sync syncThread = new Sync("sync thread A", nums);
        Sync syncB = new Sync("sync thread B", nums);
        Sync syncC= new Sync("sync thread C", nums);
        Sync syncD = new Sync("sync thread D", nums);
        Sync syncE = new Sync("sync thread E", nums);

        syncThread.start();
        syncB.start();
        syncC.start();
        syncD.start();
        syncE.start();

        System.out.println(syncThread.getNums());  //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up here.
        /*
            -Create 5 sync threads
            -Allow the list of nums to be a shared resource amongst all of the threads.
            -Protect the List from thread interference using a thread blocking technique, such as synchronization or an Atomic data structure.
        */

        /*
            Kick off a Team Thread here.
            Set the name of the thead to be your agile team name.
        */
    }
}