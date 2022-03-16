package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.module.SortingModule;

import dagger.Component;

@Component(modules = SortingModule.class)
public interface SortAlgorithmComponent {
    void inject(MainActivity mainActivity);
}
