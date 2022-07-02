package com.geektech.hw1_m5.presenter;


import com.geektech.hw1_m5.Injector;
import com.geektech.hw1_m5.model.CounterModel;
import com.geektech.hw1_m5.view.Contracts;

public class Presenter {
    CounterModel model = Injector.getModel();
    Contracts.CounterView  view;

    public void increment(){
        model.increment();
        view.updateText(model.getCount());
    }
    public void decrement(){
        model.decrement();
        view.updateText(model.getCount());
    }
    public void attachView(Contracts.CounterView view){
        this.view = view;
    }
    public void toast() {
        if(model.isTen(true)) {
            view.toast();
        }
    }
    public void colorChange() {
        if (model.isFifteen(true)) {
            view.color();
        }else {
                view.colorOther();
        }
    }

}
