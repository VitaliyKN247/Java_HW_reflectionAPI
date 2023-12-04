package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Создайте абстрактный класс "Animal" с полями "name" и "age".
//        Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//        Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//        Выведите на экран информацию о каждом объекте.
//        Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        Animal [] animals = new Animal[3];
        animals [0] = new Cat("Peach", 3);
        animals[1] = new Dog("Buddy",7);
        animals[2] = new Dog("Ralph", 2);

        for(Animal animal : animals){
            System.out.println("Animal: " + animal.getClass().getSimpleName()
            +
                    " Name " + animal.get_animal_name());
        }

        System.out.println("--------------------");

        for (Animal animal : animals){
            animal.makeSound();
        }

    }
}