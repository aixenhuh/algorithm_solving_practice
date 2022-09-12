package com.solve;

public class Calcurator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memeory) {
        this.memory = memeory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}
