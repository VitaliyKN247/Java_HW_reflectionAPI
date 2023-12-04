package org.example;

public class Cat extends Animal{
    private String hiss = "Shhhhh";  // уникальное поле шипения
    public Cat(String name, int age) {
        super(name, age);
    }


    // region Методы
    // метод мяуканья
    public void makeSound(){
        System.out.println("Meow");
    }

    //endregion
}
