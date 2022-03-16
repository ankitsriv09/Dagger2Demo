package com.example.dagger2demo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.algo.BubbleSort;
import com.example.dagger2demo.algo.QuickSort;
import com.example.dagger2demo.component.DaggerSortAlgorithmComponent;
import com.example.dagger2demo.component.SortAlgorithmComponent;
import com.example.dagger2demo.module.SortingModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static String LOG_TAG = "DaggerSample";
    private SortAlgorithmComponent sortAlgorithmComponent;
    private final int[] arr = {2,3,1,6,9,4};

    @Inject
    BubbleSort bubbleSortAlgo;

    @Inject
    QuickSort quickSortAlgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bubbleSortBtn = findViewById(R.id.bubbleSort);
        Button quickSortBtn = findViewById(R.id.quickSort);

        sortAlgorithmComponent = DaggerSortAlgorithmComponent.builder().sortingModule(new SortingModule()).build();
        sortAlgorithmComponent.inject(this);

        bubbleSortBtn.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Bubble Sort algorithm!", Toast.LENGTH_SHORT).show();
            bubbleSortAlgo.sort(arr);
        });

        quickSortBtn.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Quick Sort algorithm!", Toast.LENGTH_SHORT).show();
            quickSortAlgo.sort(arr);
        });
    }
}