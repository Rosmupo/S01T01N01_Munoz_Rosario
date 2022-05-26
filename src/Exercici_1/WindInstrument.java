package Exercici_1;

public class WindInstrument extends Instrument {
    //Atributo estático creado con el fin de implementarlo en un método estático
    // para demostrar que la clase se carga solo una vez.
    private static String text;


    public WindInstrument(String name, int price) {
        super(name, price);
        System.out.println("Soy una instancia de la clase intrumento de viento");
    }

    //Método play que se hereda de la clase Instrument y muestra por consola
    // que el instrumento se está tocando.
    public void play() {
        String text = "Está sonando un instrumento de viento";
        System.out.println(text);
    }

    //Método creado para demostrar que la carga de la clase
    // WindInstrument sólo se realiza una vez, aunque se intancien
    // varios objetos de esta clase.
    static {
        text = "Soy la clase instrumento de viento";
        System.out.println(text);
    }
}

