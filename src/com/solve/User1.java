package com.solve;

public class User1 extends Thread{
    private Calcurator calcurator;

    public void setCalcurator(Calcurator calcurator) {
        this.setName("Calcurator1");
        this.calcurator = calcurator;
    }

    public void run() {
        calcurator.setMemory(100);
    }
}
