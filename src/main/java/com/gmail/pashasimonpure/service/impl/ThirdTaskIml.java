package com.gmail.pashasimonpure.service.impl;

import com.gmail.pashasimonpure.service.*;
import com.gmail.pashasimonpure.service.model.*;
import com.gmail.pashasimonpure.service.util.Utilites;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTaskIml implements TaskService {

    private static final Logger logger = LogManager.getLogger(ThirdTaskIml.class);
    private static final Logger fileLogger = LogManager.getLogger("fileLogger");

    private List generate(int count){

        List carList = new ArrayList<Car>();

        for(int i = 0; i < count; i++ ){
            String name = "car#"+ Utilites.getRandomInt(100,999);
            CarModel model = CarModel.getRandom();
            int engineCap = Utilites.getRandomInt(1,3);

            carList.add(new Car(name,model,engineCap));
        }
        return carList;
    }


    @Override
    public void runTask() {
        logger.info("third task: (output in file)");

        List<Car> randCars = generate(10);
        Stream<Car> str = randCars.stream();
        Map<Integer, List<Car>> sortedCars = str.collect(Collectors.groupingBy(Car::getEngineCapacity));

        fileLogger.debug(sortedCars.get(new Random().nextInt()));

        //logger.debug("file logger hashcode :"+fileLogger.hashCode());

    }
}
