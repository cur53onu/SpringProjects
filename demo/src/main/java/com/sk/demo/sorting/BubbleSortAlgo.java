package com.sk.demo.sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgo implements SortAlgorithm{
    public int[] sort(int[] numbers){return numbers;}
}
