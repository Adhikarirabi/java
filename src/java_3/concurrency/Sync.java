package java_3.concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    private List nums;

    Sync(String name, List nums) {
        super(name);
        this.nums = nums;
    }

    @Override
    public void run() {
        synchronized (nums) {
            Random rand = new Random();
            for(int i=0; i<100; i++) {
                int randInt = rand.nextInt(100);
                this.nums.add(randInt);
            }
        }
    }

    public List getNums() {
        synchronized (nums) {
            return nums;
        }
    }
}