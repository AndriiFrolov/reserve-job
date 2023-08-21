package org.example;


import org.example.model.Settings;

public class Main {

    public static void main(String[] args) {
        Settings settings = new Settings(50, 48, 500);

        JobFinder jobFinder = new JobFinder(settings);
        jobFinder.startScanning();
    }
}