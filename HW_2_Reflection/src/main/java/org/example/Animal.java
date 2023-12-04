package org.example;

public abstract class Animal {

    //region Поля
    private String name; // имя
    private int age; // возраст
    //endregion

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){

    }

    public String get_animal_name() {
        return name;
    }
}
