package com.gmail.pashasimonpure.service.impl;

import com.gmail.pashasimonpure.service.*;
import com.gmail.pashasimonpure.service.model.*;
import com.gmail.pashasimonpure.service.model.CarModelEnum;
import com.gmail.pashasimonpure.service.util.Utilites;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTaskIml implements TaskService {

    private static final String FILE_PATH = "log/output.txt";

    private static final Logger logger = LogManager.getLogger(ThirdTaskIml.class);
    private static BufferedWriter WRITER;

    private List generate(int count) {

        List carList = new ArrayList<Car>();

        for (int i = 0; i < count; i++) {
            String name = "car#" + Utilites.getRandomInt(100, 999);
            CarModelEnum model = CarModelEnum.getRandom();
            int engineCap = Utilites.getRandomInt(1, 3);

            carList.add(new Car(name, model, engineCap));
        }
        return carList;
    }


    @Override
    public void runTask() {
        logger.info("third task: (output in file)");

        List<Car> randCars = generate(10);
        Stream<Car> str = randCars.stream();
        Map<Integer, List<Car>> sortedCars = str.collect(Collectors.groupingBy(Car::getEngineCapacity));

        try {
            String output = sortedCars.get(new Random().nextInt()).toString();
            WRITER = new BufferedWriter(new FileWriter(FILE_PATH));
            WRITER.write(output);
            WRITER.close();
        } catch (NullPointerException ex) {
            logger.error(ex);
        } catch (IOException e) {
            logger.error(e);
        }

    }
}
