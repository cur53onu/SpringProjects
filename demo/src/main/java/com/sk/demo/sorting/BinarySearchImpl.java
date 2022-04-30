package com.sk.demo.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
    @Autowired
    SortAlgorithm sortAlgorithm;
    /*
        1) If we dont want to use @Primary we can use
        @Autowired
        SortAlgorithm bubbleSortAlgo;
        2) @Primary has higher priority than variable name
        3) We can use @Qualifier("quick") to resolve these problem
        Ex:
        @Qualifier
        class QuickSortAlgo{}
        class BinarySearchImpl{
        @Autowired
        @Qualifier("quick")
        SortAlgorithm sortAlgorithm;
    }
     */

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch){
        numbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Pre Destroy");
    }
}
