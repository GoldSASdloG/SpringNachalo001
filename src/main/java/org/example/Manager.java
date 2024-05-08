package org.example;

public class Manager implements Staff{
    private String name;
    private int salary;

    @Override
    public void doWork(){
        System.out.println("Менеджер работает работает");
    }
}
