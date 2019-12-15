package com.gmail.pashasimonpure.service.impl;

import com.gmail.pashasimonpure.service.TaskService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class FirstTaskImpl implements TaskService {

    private static final Logger logger = LogManager.getLogger(FirstTaskImpl.class);

    @Override
    public void runTask() {
        logger.info("first task:");
        Random rand = new Random();

        Integer x = rand.nextInt();
        Integer y = rand.nextInt();
        Integer z = rand.nextInt();

        if (x > z) {
            logger.debug("x + y = "+(x + y));
        }else{
            logger.debug("z = "+z);
        }

        logger.info("average: "+(x+y+z)/3);
    }
}
