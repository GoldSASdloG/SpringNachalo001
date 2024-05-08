package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emploee implements Staff {
    private String name;
    private int salary;

    @Override
    public void doWork(){
        System.out.println("Работник работает");
    }
}
