package com.geektech.hw1_m5;


import com.geektech.hw1_m5.model.CounterModel;
import com.geektech.hw1_m5.presenter.Presenter;

public class Injector {

    public static Presenter getPresenter(){
        return new Presenter();
    }
    public static CounterModel getModel(){
        return new CounterModel();
    }
}
