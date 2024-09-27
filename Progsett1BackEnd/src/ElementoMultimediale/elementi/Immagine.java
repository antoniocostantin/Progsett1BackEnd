package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;

public class Immagine extends ElementoMultimediale {
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

    public void setLuminosità(char lum) {
        if(lum == '+'){
            this.luminosità++;
        } else if (lum == '-') {
            this.luminosità--;
        }
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("no volume in Immagine");
    }

    @Override
    public void setVolume(char vol) {
        System.out.println("no volume in Immagine");
    }

    // getter

    public int getLum() { return  this.luminosità;}

    @Override
    public int getVolume() {
        System.out.println("no volume in Immagine");
        return 0;
    }

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

        System.out.println(getTitolo() + " " + lum);
    }
}
