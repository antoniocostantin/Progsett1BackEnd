package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;


public class Video extends ElementoMultimediale implements Playable,Showable {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;

    }

    //setter

    @Override
    public void aumentaVolume() {
        this.volume++;
    }

    @Override
    public void diminuisciVolume() {
        this.volume--;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

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

    //getter
    public String getTitolo() { return this.titolo; }
    public int getDurata() { return this.durata ; }
    public int getVolume() { return this.volume; }
    public int getLum() {return  this.luminosità; }

    // play

    public void play(){
        String vol = "";
        for(int i = 0; i < this.getVolume(); i++) {
             vol = vol + "!";
        };

        String lum = "";
        for (int i = 0; i < this.getLum(); i++) {
            lum = lum + "*";
        }

        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + vol + lum );
        }
    }

}
