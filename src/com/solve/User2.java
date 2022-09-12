package com.solve;

public class User2 extends Thread{
    private Calcurator calcurator;

    public void setCalcurator(Calcurator calcurator) {
        this.setName("Calcurator2");
        this.calcurator = calcurator;
    }

    public void run() {
        calcurator.setMemory(50);
    }
}
