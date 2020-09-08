package org.lesson43.nestedclasses;

public class Electrocar {
    private int id;
    private static int test;

    //Нестатический вложенный класс class Motor
    //имеет доступ к полям объекта Electrocar (например к полю id)
    //во вложенных классах описывается логика подобъектов (мотор автомобиля) объекта Electrocar
    //вложенные классы нужны тогда, когда объект класса сложный и объект класса можно разделить на несколько подобъектов
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }

    //Статический вложенный класс static class Battery
    //не имеет доступа к полям объекта Electrocar (например к полю id)
    //имеет доступ к статическим полям объекта Electrocar (например к полю private static int test)
    //Статические классы обычно создаются для использования из вне, поэтому имеют модификатор доступа public
    public static class Battery{
        private void charge(){
            System.out.println("Battary is charging...");
        }
    }

    //конструктор который назначает поле int id
    public Electrocar(int id) {
        this.id = id;
    }

    public void start(){
        //создаем объект Motor
        Motor motor = new Motor();
        //Запускаем мотор
        motor.startMotor();

        final int x = 1;

        //Вложенный класс class SomeClass внутри метода public void start()
        //имеет доступ к нестатическим полям объекта Electrocar (например к полю id)
        //имеет доступ к переменным метода public void start() (например к final int x), есть требование, чтобы это были константы
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        //Создание объекта класса SomeClass
        SomeClass someObject = new SomeClass();
        //передает someObject методу test(someObject)
        test(someObject);

        System.out.println("Electrocar " + id + " is starting...");
    }

    //принимает объект someObject в метод private void test (Object object)
    private void test (Object object){

    }
}
