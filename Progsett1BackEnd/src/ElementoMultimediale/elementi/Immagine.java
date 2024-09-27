package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;

public class Immagine extends ElementoMultimediale implements Showable{
    private int luminosità;
    private String titolo;

    public Immagine(String titolo) {
        this.titolo = titolo;
    }

    // setter

    public void setLuminosità(int lum) {
        this.luminosità = lum;
    }


    @Override
    public void aumentaLum() {
        this.luminosità++;
    }

    @Override
    public void diminuisciLum() {
        this.luminosità--;
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
