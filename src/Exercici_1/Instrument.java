package Exercici_1;

public abstract class Instrument {

    //Atributos de la clase
    protected String name;
    protected int price;

    //Atributo estático creado con el fin de implementarlo en un método estático
    // para demostrar que la clase se carga solo una vez.
    private static String text;

    //Constructor
    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

//////////////////MÉTODOS

    //Método abstracto que será de obligado uso para las clases hijas de Intrumento
    public abstract void play();


    //Método estático que se ha creado con el fin de demostrar
    // que la carga de la clase Instrumento se realiza solo una vez.
    //Aunque se instancien  varios objetos de las clases hijas de la clase Instrument,
    // el mensaje "Soy la clase instrumento" solo se imprimirá una vez.
    static {
        text = "Soy la clase instrumento";
        System.out.println(text);
    }

}

