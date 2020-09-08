package org.lesson43.nestedclasses;

public class Test {
    public static void main(String[] args) {

        //Поле id или аргумент единица в объекте  new Electrocar(1); задано конструктором
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        //Создание объекта класса Battery
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
