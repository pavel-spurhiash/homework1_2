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

        ArrayList<Integer> randList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            randList.add(Utilites.getRandomInt(-300,300));
        }

        logger.debug("random array: "+randList);

        Integer max = Collections.max(randList);
        Integer min = Collections.min(randList);

        logger.info("array max value: " + max);
        logger.info("array min value: " + min);

        Integer newValue = randList.get(randList.indexOf(min)) * randList.get(randList.indexOf(max));
        randList.set(randList.indexOf(max) , newValue  );

        logger.error("new array: "+randList);
    }
}
