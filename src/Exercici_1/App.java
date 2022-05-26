package Exercici_1;

public class App {

    public static void main(String[] args) {

        //Creación de cuatro objetos, dos son de la clase instrumentos de viento,
        // uno es un objeto de la clase instrumento de cuerda y el último es un objeto
        // de la clase intrumento de percusión.

        WindInstrument windInstrument1 = new WindInstrument("flauta", 300);
        WindInstrument windInstrument2 = new WindInstrument("clarinete", 500);
        StringInstrument stringInstrument = new StringInstrument("guitarra", 400);
        PercussionInstrument percussionInstrument = new PercussionInstrument("tambor", 200);

        //Llamada al método play() para tres de los cuatro objetos creados.

        windInstrument1.play();
        stringInstrument.play();
        percussionInstrument.play();

    }
}
