package Lesson_11;

// Пример выполнения
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        LightCar passengerCar = new LightCar();
        Truck cargoTruck = new Truck();

        System.out.println(car.getType());              // Виведе: "Автомобіль"
        System.out.println(passengerCar.getType());     // Виведе: "Легковий автомобіль"
        System.out.println(cargoTruck.getType());       // Виведе: "Вантажний автомобіль"
    }
}