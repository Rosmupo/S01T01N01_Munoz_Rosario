package Exercici_1;

public class PercussionInstrument extends Instrument {


    public PercussionInstrument(String name, int price) {
        super(name, price);
        System.out.println("Soy una instancia de la clase instrumento de percusión");
    }

    //Método play que se hereda de la clase Instrument y muestra por consola
    // que el instrumento se está tocando.
    public void play() {
        String text = "Está sonando un instrumento de percusión";
        System.out.println(text);
    }

}

