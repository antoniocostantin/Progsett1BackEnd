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


    public void setVolume(int vol) {
        if ( vol > 10) {
            this.volume = 10;
            System.out.println("IL VOLUME PUO' ESSERE MASSIMO 10(te l'ho messo io ;))!!!");
        } else if ( vol <= 0) {
            this.volume = 0;
            System.out.println("il volume può essere minimo 0(te l'ho messo io ;)!!!");
        } else if (vol > 0 || vol > 10 ) {
            this.volume = vol;
            System.out.println("il volume è al: " + this.volume);
        }
    }

    public void setLuminosità(int lum) {
        if (lum > 10) {
            this.luminosità = 10;
            System.out.println("LA LUMINOSITA' PUO' ESSERE MASSIMO 10(te l'ho messa io ;)!!!");
        } else if (lum <= 1) {
            this.luminosità = 1;
            System.out.println("la luminosità deve essere minimo 1(te l'ho messa io ;)!!!");
        } else if (lum >= 1 || lum < 10) {
            this.luminosità = lum;
            System.out.println("La luminosità è al: " + this.luminosità);
        }
    }

    // diminuisci e aumenta

    //VOLUMEEEEEEEEEE//
    @Override
    public void aumentaVolume() {
        int vol = this.volume;
        if (vol + 1 > 10) {
            System.out.println("IL VOLUME E' GIA' AL MASSIMOOO!!!!");
        } else this.volume++;

    }

    @Override
    public void diminuisciVolume() {
        int vol = this.volume;
        if (vol - 1 < 0) {
            System.out.println("Il volume è già al minimooo...");
        } else this.volume--;
    }

    //LUMINOSITAAAAAAAAAA//
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
        System.out.println("Il tuo video:");
        for (int i = 0; i < this.getDurata(); i++) {

            System.out.println(getTitolo() + vol + lum);
        }
    }

}
