package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;

public class Immagine extends ElementoMultimediale implements Showable{
    private int luminosità;
    private String titolo;

    public Immagine(String titolo) {
        this.titolo = titolo;
        this.luminosità = 5;
    }

    // setter

        public void setLuminosità(int lum) {
            if (lum > 10) {
                this.luminosità = 10;
                System.out.println("LA LUMINOSITA' PUO' ESSERE MASSIMO 10(te l'ho messa io ;)!!!");
            } else if (lum <= 1) {
                this.luminosità = 1;
                System.out.println("la luminosità può essere minimo 0(te l'ho messa io ;)!!!");
            } else if (lum >= 1 || lum < 10) {
                this.luminosità = lum;
                System.out.println("La luminosità è al: " + this.luminosità);
            }
    }

// diminuisci e aumenta
    @Override
    public void aumentaLum() {
        int lum = this.luminosità;
        if(lum + 1 >10){
            System.out.println("LA LUMINOSITà E' GIA' AL MASISIMOOOO!!!!");
        } else  this.luminosità++;
    }

    @Override
    public void diminuisciLum() {
        int lum = this.luminosità;
        if(lum - 1 < 1){
            System.out.println("la luminosità è già al minimo ....");
        } else  this.luminosità--;
    }
// getter

    public int getLum() { return  this.luminosità;}



    public String getTitolo() { return  this.titolo;}

    // play


    @Override
    public void play() {
        show();
    }

    public void show() {
        String lum= "";
        for (int i = 0; i < getLum(); i++) {
            lum = lum + "*";
        }
        System.out.println("La tua immagine :");
        System.out.println(getTitolo() + lum);
    }
}
