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
        this.luminosità = lum;
    }


    @Override
    public void aumentaLum() {
        int lum = this.luminosità;
        if(lum + 1 >10){
            System.out.println("la luminosità deve essere compreso tra 1 e 10");
        } else  this.luminosità++;
    }

    @Override
    public void diminuisciLum() {
        int lum = this.luminosità;
        if(lum - 1 <= 0){
            System.out.println("la luminosità deve essere compreso tra 1 e 10");
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

        System.out.println(getTitolo() + lum);
    }
}
