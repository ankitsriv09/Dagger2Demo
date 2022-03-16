package com.example.dagger2demo.algo;

import android.util.Log;

import com.example.dagger2demo.MainActivity;

import javax.inject.Inject;


public class QuickSort implements SortingIx {

    @Override
    public void sort(int[] arr) {
        Log.i(MainActivity.LOG_TAG, "Bubble Sort called!");
        //BubbleSort logic goes here
    }
}
