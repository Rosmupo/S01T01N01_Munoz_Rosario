package Exercici_1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
        System.out.println("Soy una instancia de la clase intrumentos de cuerda");
    }

    //Método play que se hereda de la clase Instrument y muestra por consola
    // que el instrumento se está tocando.
    public void play() {
        String text = "Está sonando un instrumento de cuerdas";
        System.out.println(text);
    }
}
