package com.geektech.hw1_m5.model;

public class CounterModel {
    int count;

    public int getCount() {
        return count;
    }
    public void increment(){
        ++count;
    }
    public void decrement(){
        --count;
    }


    public boolean isTen(boolean ten) {
        ten = count == 10;
        return ten;
    }
    public boolean isFifteen(boolean fifteen) {
        fifteen = count == 15;
        return fifteen;
    }
}
