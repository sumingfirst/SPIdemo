package com.example.spidemo;

import com.example.spidemo.Interface.ServicesRegistrationCenter;

import java.util.ServiceLoader;

public class SPItest {
    public static void main(String[] args) {
           ServiceLoader<ServicesRegistrationCenter> servicesRegistrationCenters = ServiceLoader.load(ServicesRegistrationCenter.class);
               for (ServicesRegistrationCenter src :servicesRegistrationCenters) {
                 src.register("filePath");
               }
           }

}
