package com.geektech.hw1_m5;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.hw1_m5.databinding.ActivityMainBinding;
import com.geektech.hw1_m5.presenter.Presenter;
import com.geektech.hw1_m5.view.Contracts;


public class MainActivity extends AppCompatActivity implements Contracts.CounterView {
    ActivityMainBinding binding;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getPresenter();
        presenter.attachView(this);
        initClick();
    }

    private void initClick() {
        binding.incrementBtn.setOnClickListener(v -> {
            presenter.increment();
            presenter.toast();
            presenter.colorChange();
        });
        binding.decrementBtn.setOnClickListener(v -> {
            presenter.decrement();
            presenter.toast();
            presenter.colorChange();
    });
    }

    @Override
    public void updateText(int count) {
        binding.counterTv.setText(String.valueOf(count));
    }

    @Override
    public void toast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void color() {
        binding.counterTv.setTextColor(this.getResources().getColor(R.color.green, getTheme()));
    }

    @Override
    public void colorOther() {
        binding.counterTv.setTextColor(this.getResources().getColor(R.color.red, getTheme()));
    }
}