package com.gmail.pashasimonpure.service.impl;

import com.gmail.pashasimonpure.service.TaskService;
import com.gmail.pashasimonpure.service.util.Utilites;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstTaskImpl implements TaskService {

    private static final Logger logger = LogManager.getLogger(FirstTaskImpl.class);

    @Override
    public void runTask() {
        logger.info("first task:");

        Integer x = Utilites.getRandomInt();
        Integer y = Utilites.getRandomInt();
        Integer z = Utilites.getRandomInt();

        if (x > z) {
            logger.debug("x + y = " + (x + y));
        } else {
            logger.debug("z = " + z);
        }

        logger.info("average: " + (x + y + z) / 3);
    }
}
