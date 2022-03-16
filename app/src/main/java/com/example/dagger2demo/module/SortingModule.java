package com.example.dagger2demo.module;

import com.example.dagger2demo.algo.BubbleSort;
import com.example.dagger2demo.algo.QuickSort;

import dagger.Module;
import dagger.Provides;

@Module
public class SortingModule {

    @Provides
    public BubbleSort getBubbleSortAlgo() {
       return new BubbleSort();
    }

    @Provides
    public QuickSort getQuickSortAlgo() {
        return new QuickSort();
    }
}
