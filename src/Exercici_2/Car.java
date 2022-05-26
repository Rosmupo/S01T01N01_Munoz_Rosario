package Exercici_2;

public class Car {

    //ATRIBUTOS
    private static final String brand = "Peugeot";
    private static int model;
    private final int power;

    //CONSTRUCTOR
    //Las variables que pueden inicializarse desde el contructor son modelo y potencia
    public Car() {
        model = 2;
        power = 10;

    }

    //MÉTODOS
    public static void slowDown() {
        System.out.println("El vehículo está frenando");
    }

    public void speedUp() {
        System.out.println("El vehículo está acelerando");
    }


}

