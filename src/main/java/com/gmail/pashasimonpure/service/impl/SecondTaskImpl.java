package com.gmail.pashasimonpure.service.impl;

import com.gmail.pashasimonpure.service.TaskService;
import com.gmail.pashasimonpure.service.util.Utilites;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class SecondTaskImpl implements TaskService {


    private static final Logger logger = LogManager.getLogger(SecondTaskImpl.class);

    @Override
    public void runTask() {
        logger.info("second task:");

        int arr[] = new int[10];
        int max = 0;
        int min = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Utilites.getRandomInt(-300, 300);

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }

        }

        logger.debug("random array: " + Arrays.toString(arr));
        logger.info("array max value: " + max + " index: " + maxIndex);
        logger.info("array min value: " + min + " index: " + minIndex);

        int newValue = arr[minIndex] * arr[maxIndex];
        arr[maxIndex] = newValue;

        logger.error("new array: " + Arrays.toString(arr));
    }
}
