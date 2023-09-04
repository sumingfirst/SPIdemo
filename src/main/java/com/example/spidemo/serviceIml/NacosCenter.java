package com.example.spidemo.serviceIml;

public class Nacos implements com.example.spidemo.Interface.ServicesRegistrationCenter{
    @Override
    public void register(String RegistrationCenterName) {
        System.out.println("Nacos register");
    }
}

