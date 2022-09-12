package com.solve;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StatePrintThread statePrintThread = new StatePrintThread(new Thread(() -> {
            for(long i = 0; i < 100000000; i++) {}

            try {
                Thread.sleep(1500);
            } catch(Exception e) {}

            for(long i = 0; i < 1000000000; i++) {}
        }));
        statePrintThread.start();
    }
}



