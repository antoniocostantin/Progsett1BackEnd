package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;


public class Video extends ElementoMultimediale implements Playable, Showable {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = 5;
        this.luminosità = 5;
    }

    //setter


    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLuminosità(int lum) {
        this.luminosità = lum;
    }


    @Override
    public void aumentaVolume() {
        int vol = this.volume;
        if (vol + 1 > 10) {
            System.out.println("Il volume deve essere compreso tra 0 e 10");
        } else this.volume++;

    }

    @Override
    public void diminuisciVolume() {
        int vol = this.volume;
        if (vol - 1 <= 0) {
            System.out.println("Il volume deve essere compreso tra 0 e 10");
        } else this.volume--;
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
        if(lum - 1 >= 0){
            System.out.println("la luminosità deve essere compreso tra 1 e 10");
        } else  this.luminosità--;
    }

    //getter
    public String getTitolo() {
        return this.titolo;
    }

    public int getDurata() {
        return this.durata;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getLum() {
        return this.luminosità;
    }

    // play

    public void play() {
        String vol = "";
        for (int i = 0; i < this.getVolume(); i++) {
            vol = vol + "!";
        }
        ;

        String lum = "";
        for (int i = 0; i < this.getLum(); i++) {
            lum = lum + "*";
        }

        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + vol + lum);
        }
    }

}
