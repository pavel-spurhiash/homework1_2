package com.gmail.pashasimonpure;

import com.gmail.pashasimonpure.service.TaskService;
import com.gmail.pashasimonpure.service.impl.FirstTaskImpl;
import com.gmail.pashasimonpure.service.impl.SecondTaskImpl;
import com.gmail.pashasimonpure.service.impl.ThirdTaskIml;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {

    /*private static final Logger classLogger =   LogManager.getLogger(App.class);

    private static final Logger fileLogger =    LogManager.getLogger("fileLogger");
    private static final Logger consoleLogger = LogManager.getLogger("consoleLogger");
    private static final Logger rootLogger  =   LogManager.getRootLogger();*/


    public static void main( String[] args ){
        //consoleLogger.info( "file logger hashcode :"+fileLogger.hashCode() );

        TaskService service;

        service = new FirstTaskImpl();
        service.runTask();
        service = new SecondTaskImpl();
        service.runTask();
        service = new ThirdTaskIml();
        service.runTask();


    }
}
