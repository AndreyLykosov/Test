package Lesson_11;

class Car {
    public String getType() {
        return "Автомобіль";
    }
}

// Подкласс "Легковий автомобіль"
class LightCar extends Car {
    @Override
    public String getType() {
        return "Легковий автомобіль";
    }
}

// Подкласс "Вантажний автомобіль"
class Truck extends Car {
    @Override
    public String getType() {
        return "Вантажний автомобіль";
    }
}

