package Exercici_2;

public class App {

    public static void main(String[] args) {

        Car car = new Car();

        //Los métodos no estáticos pueden ser llamados desde las instancias de la clase
        car.speedUp();

        //Los métodos estáticos deben ser llamados desde la clase
        Car.slowDown();
    }
}

